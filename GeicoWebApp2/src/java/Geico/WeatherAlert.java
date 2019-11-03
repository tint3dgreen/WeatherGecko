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
public class WeatherAlert {
    public boolean Alert;
    private final String AlertAPI = "http://dataservice.accuweather.com/alarms/v1/1day/";
    private final String apiKey = "?apikey=Bm6lcTWBL5oy8MiDnw8G4hCZlHC9xFya";
    
    public WeatherAlert(String locationKey){
        String finalURL = AlertAPI + locationKey+apiKey;
        JSONFind j = new JSONFind(finalURL);
        String StringSon = j.getJSON();
        System.out.println(StringSon.length());
        try{
             StringSon = StringSon.substring(1,StringSon.length()-1);
        }
        catch(NullPointerException e){
            this.Alert = false;
        }
        
    }
    
    public boolean getAlert(){return this.Alert;}
    
    public void setAlert(boolean newAlert){this.Alert = newAlert;}
}
