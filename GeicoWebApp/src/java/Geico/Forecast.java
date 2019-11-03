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
    public String dateTime;
    public int epochTime;
    public double tempValue;
    public String unit;
    public int precipProb;
    public int humidity;
    public int tempFeelsLike;
    public int UVIndex;
    public int windGust;
    public int rainAMT;
    public int snowAMT;
    public int iceAMT;
    
    public Forecast(String newDateTime, int newEpochTime, double newTempValue,String newUnit, int newPrecipProb,int newHumidity,int newTempFeelsLike,int newUVIndex,int newWindGust,int rain,int snow, int ice){
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
    }
}
