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
public class Location {
    public String zipCode;
    public String locationKey;
    private final String locationAPI = "http://dataservice.accuweather.com/locations/v1/postalcodes/search?apikey=Bm6lcTWBL5oy8MiDnw8G4hCZlHC9xFya&q=";
    
    public Location(String zipCode){
        this.zipCode = zipCode;
        String finalUrl = locationAPI + zipCode;
        JSONFind j = new JSONFind(finalUrl);
        String StringSon = j.getJSON();
        StringSon = StringSon.substring(1,StringSon.indexOf("}"))+"}}";
        System.out.println("Location\n" + StringSon);
        try{
            JSONObject LocSon = new JSONObject(StringSon);
            this.locationKey = LocSon.getString("Key");
        }
        catch (JSONException err){
            System.out.println(err);
            this.locationKey = "7240_PC";
         //commente dsad
        }
    }
}
