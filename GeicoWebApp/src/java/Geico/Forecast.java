/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geico;

import org.json.*;

/**
 *
 * @author carsc
 */
public class Forecast {

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
    private final String ForecastAPI = "http://dataservice.accuweather.com/forecasts/v1/hourly/1hour/";
    private final String apiKey = "?apikey=Bm6lcTWBL5oy8MiDnw8G4hCZlHC9xFya&";
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
    
    public Forecast(String locationKey){
        String finalURl = ForecastAPI+locationKey+apiKey+"details=true";
        JSONFind j = new JSONFind(finalURl);
        String StringSon = j.getJSON();
        StringSon = StringSon.substring(1,StringSon.length()-1);
        try{
            JSONObject ForSon = new JSONObject(StringSon);
                    this.dateTime = ForSon.getString("DateTime");
                    this.epochTime = ForSon.getInt("EpochDateTime");
                    this.tempValue = ForSon.getJSONObject("Temperature").getDouble("Value");
                    this.unit = ForSon.getJSONObject("Temperature").getString("Unit");
                    this.precipProb = ForSon.getInt("PrecipitationProbability");
                    this.humidity = ForSon.getInt("RelativeHumidity");
                    this.tempFeelsLike = ForSon.getJSONObject("RealFeelTemperature").getInt("Value");
                    this.UVIndex = ForSon.getInt("UVIndex");
                    this.windGust = ForSon.getJSONObject("WindGust").getJSONObject("Speed").getInt("Value");
                    this.rainAMT = ForSon.getJSONObject("Rain").getInt("Value");
                    this.snowAMT = ForSon.getJSONObject("Snow").getInt("Value");
                    this.iceAMT = ForSon.getJSONObject("Ice").getInt("Value");
                    this.visibility = ForSon.getJSONObject("Visibility").getDouble("Value");
        }
        catch (JSONException err){
            System.out.println(err);
    }
}
}
