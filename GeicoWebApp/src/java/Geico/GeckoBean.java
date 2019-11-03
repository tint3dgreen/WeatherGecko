/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geico;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author carsc
 */
@ManagedBean(name="geckoBean")
@SessionScoped
public class GeckoBean {

    /**
     * @return the dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return the epochTime
     */
    public int getEpochTime() {
        return epochTime;
    }

    /**
     * @param epochTime the epochTime to set
     */
    public void setEpochTime(int epochTime) {
        this.epochTime = epochTime;
    }

    /**
     * @return the tempValue
     */
    public double getTempValue() {
        return tempValue;
    }

    /**
     * @param tempValue the tempValue to set
     */
    public void setTempValue(double tempValue) {
        this.tempValue = tempValue;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the precipProb
     */
    public int getPrecipProb() {
        return precipProb;
    }

    /**
     * @param precipProb the precipProb to set
     */
    public void setPrecipProb(int precipProb) {
        this.precipProb = precipProb;
    }

    /**
     * @return the humidity
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the tempFeelsLike
     */
    public int getTempFeelsLike() {
        return tempFeelsLike;
    }

    /**
     * @param tempFeelsLike the tempFeelsLike to set
     */
    public void setTempFeelsLike(int tempFeelsLike) {
        this.tempFeelsLike = tempFeelsLike;
    }

    /**
     * @return the UVIndex
     */
    public int getUVIndex() {
        return UVIndex;
    }

    /**
     * @param UVIndex the UVIndex to set
     */
    public void setUVIndex(int UVIndex) {
        this.UVIndex = UVIndex;
    }

    /**
     * @return the windGust
     */
    public int getWindGust() {
        return windGust;
    }

    /**
     * @param windGust the windGust to set
     */
    public void setWindGust(int windGust) {
        this.windGust = windGust;
    }

    /**
     * @return the rainAMT
     */
    public int getRainAMT() {
        return rainAMT;
    }

    /**
     * @param rainAMT the rainAMT to set
     */
    public void setRainAMT(int rainAMT) {
        this.rainAMT = rainAMT;
    }

    /**
     * @return the snowAMT
     */
    public int getSnowAMT() {
        return snowAMT;
    }

    /**
     * @param snowAMT the snowAMT to set
     */
    public void setSnowAMT(int snowAMT) {
        this.snowAMT = snowAMT;
    }

    /**
     * @return the iceAMT
     */
    public int getIceAMT() {
        return iceAMT;
    }

    /**
     * @param iceAMT the iceAMT to set
     */
    public void setIceAMT(int iceAMT) {
        this.iceAMT = iceAMT;
    }

    /**
     * @return the visibility
     */
    public double getVisibility() {
        return visibility;
    }

    /**
     * @param visibility the visibility to set
     */
    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the locationKey
     */
    public String getLocationKey() {
        return locationKey;
    }

    /**
     * @param locationKey the locationKey to set
     */
    public void setLocationKey(String locationKey) {
        this.locationKey = locationKey;
    }

    /**
     * @return the Alert
     */
    public boolean isAlert() {
        return Alert;
    }

    /**
     * @param Alert the Alert to set
     */
    public void setAlert(boolean Alert) {
        this.Alert = Alert;
    }
    
    public int calcAutoRate() {
        double rateAuto = 100;
        if (this.isAlert() == true) {

            rateAuto = 0;
        } else {
            rateAuto = precipitate(rateAuto);

            rateAuto = temperature(rateAuto);

            if (visibility <= 2) {
                if (visibility == 0) {
                    rateAuto -= 50;
                }
                rateAuto -= 50;
            }

            if (this.getWindGust() > 25) {
                rateAuto -= 2 * (this.getWindGust() - 25);
            }
        }

        if (rateAuto < 0) {
            rateAuto = 0;
        }

        return (int) rateAuto;
    }

    public int calcBoatingRate() {
        double rateBoat = 100;
        if (this.isAlert() == true) {
            rateBoat = 0;
        } else {
            rateBoat = precipitate(rateBoat);

            rateBoat = realFeelTemperature(rateBoat);

            rateBoat = UV(rateBoat);

            if (visibility <= 2) {
                if (visibility == 0) {
                    rateBoat -= 30;
                }
                rateBoat -= 20;
            }

            if (this.getWindGust() > 9) {
                rateBoat -= (100 / 7) * (this.getWindGust() - 9);
            }
        }

        if (rateBoat < 0) {
            rateBoat = 0;
        }

        return (int) rateBoat;
    }
    
    public int calcWellnessFitnessRate(){
        double fitnessRate = 100;
        
        if (this.isAlert() == true) {
            fitnessRate = 0;
        } else {
            fitnessRate = precipitate(fitnessRate);

            fitnessRate = realFeelTemperature(fitnessRate);

            fitnessRate = UV(fitnessRate);

            if (this.getWindGust() > 24) {
                fitnessRate -= (100 / 14) * (this.getWindGust() - 24);
            }
        }

        if (fitnessRate < 0) {
            fitnessRate = 0;
        }
        
        return (int) fitnessRate;
    }
    
    public int calcMotercycleRate(){
        double motercycleRate = 100;
        
        if (this.isAlert() == true) {
            motercycleRate = 0;
        } else {
            motercycleRate = precipitate(motercycleRate);
            
            motercycleRate = UV(motercycleRate);
            
            if(this.getWindGust() > 24){
                motercycleRate -= (100/14) * (this.getWindGust() - 24);
            }
            
            if (visibility <= 2) {
                if (visibility == 0) {
                    motercycleRate -= 50;
                }
                motercycleRate -= 50;
            }
            
            motercycleRate = realFeelTemperature(motercycleRate);
        }
        
        if (motercycleRate < 0) {
            motercycleRate = 0;
        }
        
        return (int) motercycleRate;
    }
    
    public int calcFlightRate(){
        double flightRate = 0;
        
        if (this.isAlert() == true) {
            flightRate = 0;
        } else {
            
            flightRate = precipitate(flightRate);
            
            flightRate = temperature(flightRate);
            
            if (this.getVisibility() <= 2) {
                if (this.getVisibility() == 0) {
                    flightRate -= 50;
                }
                flightRate -= 50;
            }
        }
        
        if (flightRate < 0) {
            flightRate = 0;
        }
        
        return (int) flightRate;
    }

    public double precipitate(double rate) {
        switch (pType) {
            case ("Rain"):
                rate -= 16.66 * Math.pow(this.getPrecipProb(), 1 / this.getPrecipProb()) * Math.pow(this.getRainAMT(), this.getRainAMT() / 6);
                break;
            case ("Snow"):
                rate -= 25 * Math.pow(this.getPrecipProb(), 1 / this.getPrecipProb()) * Math.pow(this.getSnowAMT(), this.getSnowAMT() / 4);
                break;
            case ("Ice"):
                rate -= 30;
                break;
            case ("Mixed"):
                rate -= .5 * (16.66 * Math.pow(this.getPrecipProb(), 1 / this.getPrecipProb()) * Math.pow(this.getRainAMT(), this.getRainAMT() / 6) + 25 * Math.pow(this.getPrecipProb(), 1 / this.getPrecipProb()) * Math.pow(this.getSnowAMT(), this.getSnowAMT() / 4));
                break;
        }
        return rate;
    }

    public double temperature(double rate) {
        if (this.getTempValue() < 32) {
            rate -= 32 - this.getTempValue();
        }
        return rate;
    }

    public double realFeelTemperature(double rate) {
        if (this.getTempFeelsLike() > 90) {
            rate -= Math.pow(1.35, this.getTempFeelsLike() - 90);
        }

        if (this.getTempFeelsLike() < 40) {
            rate -= Math.pow(1.12, 40 - this.getTempFeelsLike());
        }

        return rate;
    }

    public double UV(double rate) {
        if (this.getUVIndex() > 30) {
            rate -= Math.pow(this.getUVIndex(), 1.9) / 2;
        }
        return rate;
    }
    
    private String dateTime;
    private int epochTime;
    private double tempValue;
    private String unit;
    private int precipProb;
    private int humidity;
    private int tempFeelsLike;
    private int UVIndex;
    private int windGust;
    private int rainAMT;
    private int snowAMT;
    private int iceAMT;
    private double visibility;
    
    private String zipCode;
    private String locationKey;
    private String pType;
    
    private boolean Alert;
    
    
    
}
