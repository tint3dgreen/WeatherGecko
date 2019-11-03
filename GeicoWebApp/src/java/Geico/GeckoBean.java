/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geico;
import java.util.Random;
import org.json.*;
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
     * @return the autoMessage
     */
    public String getAutoMessage() {
        return autoMessage;
    }

    /**
     * @param autoMessage the autoMessage to set
     */
    public void setAutoMessage(String autoMessage) {
        this.autoMessage = autoMessage;
    }

    /**
     * @return the boatMessage
     */
    public String getBoatMessage() {
        return boatMessage;
    }

    /**
     * @param boatMessage the boatMessage to set
     */
    public void setBoatMessage(String boatMessage) {
        this.boatMessage = boatMessage;
    }

    /**
     * @return the healthMessage
     */
    public String getHealthMessage() {
        return healthMessage;
    }

    /**
     * @param healthMessage the healthMessage to set
     */
    public void setHealthMessage(String healthMessage) {
        this.healthMessage = healthMessage;
    }

    /**
     * @return the motorMessage
     */
    public String getMotorMessage() {
        return motorMessage;
    }

    /**
     * @param motorMessage the motorMessage to set
     */
    public void setMotorMessage(String motorMessage) {
        this.motorMessage = motorMessage;
    }

    /**
     * @return the planeMessage
     */
    public String getPlaneMessage() {
        return planeMessage;
    }

    /**
     * @param planeMessage the planeMessage to set
     */
    public void setPlaneMessage(String planeMessage) {
        this.planeMessage = planeMessage;
    }

    /**
     * @return the AutoRate
     */
    public int getAutoRate() {
        return AutoRate;
    }

    /**
     * @param AutoRate the AutoRate to set
     */
    public void setAutoRate(int AutoRate) {
        this.AutoRate = AutoRate;
    }

    /**
     * @return the BoatingRate
     */
    public int getBoatingRate() {
        return BoatingRate;
    }

    /**
     * @param BoatingRate the BoatingRate to set
     */
    public void setBoatingRate(int BoatingRate) {
        this.BoatingRate = BoatingRate;
    }

    /**
     * @return the WellnessRate
     */
    public int getWellnessRate() {
        return WellnessRate;
    }

    /**
     * @param WellnessRate the WellnessRate to set
     */
    public void setWellnessRate(int WellnessRate) {
        this.WellnessRate = WellnessRate;
    }

    /**
     * @return the MotorcycleRate
     */
    public int getMotorcycleRate() {
        return MotorcycleRate;
    }

    /**
     * @param MotorcycleRate the MotorcycleRate to set
     */
    public void setMotorcycleRate(int MotorcycleRate) {
        this.MotorcycleRate = MotorcycleRate;
    }

    /**
     * @return the FlightRate
     */
    public int getFlightRate() {
        return FlightRate;
    }

    /**
     * @param FlightRate the FlightRate to set
     */
    public void setFlightRate(int FlightRate) {
        this.FlightRate = FlightRate;
    }

    /**
     * @return the ptype
     */
    public String getPtype() {
        return ptype;
    }

    /**
     * @param ptype the ptype to set
     */
    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

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
    
    //location values
    private String zipCode;
    private String locationKey;
    
    private boolean Alert;
    
    private String ptype;
    
    private int AutoRate;
    private int BoatingRate;
    private int WellnessRate;
    private int MotorcycleRate;
    private int FlightRate;
    
    private String autoMessage;
    private String boatMessage;
    private String healthMessage;
    private String motorMessage;
    private String planeMessage;
    
    public double precipitate(double rate) {
        switch (getPtype()) {
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
    
    public void calcAutoRate() {
        double rateAuto = 100;
        if (isAlert()) {
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

        setAutoRate((int)rateAuto);
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
    
    public void calcBoatingRate() {
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

            if (this.getWindGust() > 16) {
                rateBoat -= 2 * (this.getWindGust() - 16);
            }
        }

        if (rateBoat < 0) {
            rateBoat = 0;
        }

        setBoatingRate((int)rateBoat);
    }
    
    public void calcWellnessFitnessRate(){
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
        
        setWellnessRate((int)fitnessRate) ;
    }
    
    public void calcMotorcycleRate(){
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
        
        setMotorcycleRate((int)motercycleRate);
    }
    
    public void calcFlightRate(){
        double flightRate = 100;
        
        if (isAlert() == true) {
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
        
        setFlightRate((int)flightRate);
    }
    
    public void findAutoMessage(int autoRate){
        if (autoRate <= 100&&autoRate>=85){
            setAutoMessage("No weather issues to report");
        }
        if (autoRate <= 84&&autoRate>=55){
            setAutoMessage("Nothing you can't handle");
        }
        if (autoRate <= 54&&autoRate>=35){
            setAutoMessage("Be alert for changing road conditions");
        }
        if (autoRate <= 34&&autoRate>=10){
            setAutoMessage("Either take caution or postpone your trip");
        }
        if (autoRate <= 0&&autoRate>=9){
            setAutoMessage("Buckle up buddy, you're in for a ride");
        }
        
    }
   
    public void findMotorMessage(int motorRate){
        if (motorRate <= 100&&motorRate>=85){
            setMotorMessage("Enjoy the ride");
        }
        if (motorRate <= 84&&motorRate>=55){
            setMotorMessage("Be prepared for some suboptimal weather");
        }
        if (motorRate <= 54&&motorRate>=35){
            setMotorMessage("Be careful of the conditions");
        }
        if (motorRate <= 34&&motorRate>=10){
            setMotorMessage("Try again another day");
        }
        if (motorRate <= 0&&motorRate>=9){
            setMotorMessage("No... Just No");
        }
        
    }
    public void findHealthMessage(int healthRate){
        if (healthRate <= 100&&healthRate>=85){
            setHealthMessage("Now's a good time to work out and relax");
        }
        if (healthRate <= 84&&healthRate>=55){
            setHealthMessage("Be prepared for possible weather issues");
        }
        if (healthRate <= 54&&healthRate>=35){
            setHealthMessage("Maybe today isn't a good day for outdoor activities");
        }
        if (healthRate <= 34&&healthRate>=10){
            setHealthMessage("Stay indoors today");
        }
        if (healthRate <= 0&&healthRate>=9){
            setHealthMessage("The outdoors aren't safe right now");
        }
    }
    
    public void findBoatMessage(int boatRate){
        if (boatRate <= 100&&boatRate>=85){
            setBoatMessage("Smooth Sailing all the way");
        }
        if (boatRate <= 84&&boatRate>=55){
            setBoatMessage("A few waves");
        }
        if (boatRate <= 54&&boatRate>=35){
            setBoatMessage("Be prepared for some harsh waves and lower visibility");
        }
        if (boatRate <= 34&&boatRate>=10){
            setBoatMessage("The waves are gonna be really rough");
        }
        if (boatRate <= 0&&boatRate>=9){
            setBoatMessage("We're gonna need a bigger boat");
        }
    }
    public void findPlaneMessage(int planeRate){
        if (planeRate <= 100&&planeRate>=85){
            setPlaneMessage("Like floating on clouds");
        }
        if (planeRate <= 84&&planeRate>=55){
            setPlaneMessage("Shouldn't be any issues");
        }
        if (planeRate <= 54&&planeRate>=35){
            setPlaneMessage("Be cautious of flight delays");
        }
        if (planeRate <= 34&&planeRate>=10){
            setPlaneMessage("Your flight has a high probability of delay or cancelation");
        }
        if (planeRate <= 0&&planeRate>=9){
            setPlaneMessage("Maybe it's time to reschedule your flight");
        }
    }
    
    
    public String apiPull(){
        Location l = new Location(getZipCode());
        setLocationKey(l.getLocationKey());
        Forecast f = new Forecast(getLocationKey());
        
        setDateTime(f.getDateTime());
        setEpochTime(f.getEpochTime());
        setTempValue(f.getTempValue());
        setUnit(f.getUnit());
        setPrecipProb(f.getPrecipProb());
        setHumidity(f.getHumidity());
        setTempFeelsLike(f.getTempFeelsLike());
        setUVIndex(f.getUVIndex());
        setWindGust(f.getWindGust());
        setRainAMT(f.getRainAMT());
        setSnowAMT(f.getSnowAMT());
        setIceAMT(f.getIceAMT());
        setVisibility(f.getVisibility());
        
        WeatherAlert w = new WeatherAlert(getLocationKey());
        setAlert(w.getAlert());
        
        CurrentConditions c = new CurrentConditions(getLocationKey());
        setPtype(c.getpType());
        
        calcAutoRate();
        calcBoatingRate();
        calcWellnessFitnessRate();
        calcMotorcycleRate();
        calcFlightRate();
        
        findAutoMessage(getAutoRate());
        findMotorMessage(getMotorcycleRate());
        findHealthMessage(getWellnessRate());
        findBoatMessage(getBoatingRate());
        findPlaneMessage(getFlightRate());
        return "Result";
    }
}


