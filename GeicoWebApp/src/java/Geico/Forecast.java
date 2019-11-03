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
    public int weatherIcon;
    public String iconPhrase;
    public boolean hasPrecipitation;
    public boolean isDayLight;
    public int tempValue;
    public char unit;
    public int unitType;
    public int precipProb;
    
    public Forecast(String newDateTime, int newEpochTime, int newWeatherIcon, String newIconPhrase,boolean newHasPrecipitation,boolean newIsDayLight, int newTempValue,char newUnit,int newUnitType, int newPrecipProb){
        this.dateTime = newDateTime;
        this.epochTime = newEpochTime;
        this.weatherIcon = newWeatherIcon;
        this.iconPhrase = newIconPhrase;
        this.hasPrecipitation = newHasPrecipitation;
        this.isDayLight = newIsDayLight;
        this.tempValue = newTempValue;
        this.unit = newUnit;
        this.unitType = newUnitType;
        this.precipProb = newPrecipProb;
    }
}
