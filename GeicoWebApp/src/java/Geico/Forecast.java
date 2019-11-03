/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geico;

/**
 *
 * @author carsc
 */
public class Forecast {

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
    
    public Forecast(String newDateTime, int newEpochTime, double newTempValue,String newUnit, int newPrecipProb,int newHumidity,int newTempFeelsLike,int newUVIndex,int newWindGust,int rain,int snow, int ice, double visibility){
        this.dateTime = newDateTime;
        this.epochTime = newEpochTime;
        this.tempValue = newTempValue;
        this.unit = newUnit;
        this.precipProb = newPrecipProb;
        this.humidity = newHumidity;
        this.tempFeelsLike = newTempFeelsLike;
        this.UVIndex = newUVIndex;
        this.windGust = newWindGust;
        this.rainAMT = rain;
        this.snowAMT = snow;
        this.iceAMT = ice;
        this.visibility = visibility;
    }
    
        public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getEpochTime() {
        return epochTime;
    }


    public void setEpochTime(int epochTime) {
        this.epochTime = epochTime;
    }

    public double getTempValue() {
        return tempValue;
    }

    public void setTempValue(double tempValue) {
        this.tempValue = tempValue;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrecipProb() {
        return precipProb;
    }

    public void setPrecipProb(int precipProb) {
        this.precipProb = precipProb;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTempFeelsLike() {
        return tempFeelsLike;
    }

    public void setTempFeelsLike(int tempFeelsLike) {
        this.tempFeelsLike = tempFeelsLike;
    }

    public int getUVIndex() {
        return UVIndex;
    }

    public void setUVIndex(int UVIndex) {
        this.UVIndex = UVIndex;
    }

    public int getWindGust() {
        return windGust;
    }

    public void setWindGust(int windGust) {
        this.windGust = windGust;
    }

    public int getRainAMT() {
        return rainAMT;
    }

    public void setRainAMT(int rainAMT) {
        this.rainAMT = rainAMT;
    }

    public int getSnowAMT() {
        return snowAMT;
    }

    public void setSnowAMT(int snowAMT) {
        this.snowAMT = snowAMT;
    }

    public int getIceAMT() {
        return iceAMT;
    }

    public void setIceAMT(int iceAMT) {
        this.iceAMT = iceAMT;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }
}
