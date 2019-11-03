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
    private String zipCode;
    private String locationKey;
    private final String locationAPI = "http://dataservice.accuweather.com/locations/v1/postalcodes/search?apikey=Bm6lcTWBL5oy8MiDnw8G4hCZlHC9xFya&q=";
    
    public Location(String zipCode){
        this.zipCode = zipCode;
        String finalUrl = locationAPI + zipCode;
        JSONFind j = new JSONFind(finalUrl);
        String StringSon = j.getJSON();
        try{
            StringSon = StringSon.substring(1,StringSon.indexOf("}"))+"}}";
            System.out.println("Location\n" + StringSon);
            JSONObject LocSon = new JSONObject(StringSon);
            this.locationKey = LocSon.getString("Key");
        }
        catch (JSONException err){
            System.out.println(err);
            this.locationKey = "7240_PC";
         //commente dsad
        }
        catch(StringIndexOutOfBoundsException o){
            System.out.println(o);
            this.locationKey = "7240_PC";
        }
    }
}
