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
public class CurrentConditions {

    /**
     * @return the pType
     */
    public String getpType() {
        return pType;
    }

    /**
     * @param pType the pType to set
     */
    public void setpType(String pType) {
        this.pType = pType;
    }
    private String pType;
    private final String CurrentConditionsAPI = "http://dataservice.accuweather.com/currentconditions/v1/";
    private final String apiKey = "?apikey=Bm6lcTWBL5oy8MiDnw8G4hCZlHC9xFya";
    
    public CurrentConditions(String locationKey){
        String finalURL = this.CurrentConditionsAPI + locationKey + apiKey + "&details=true";
        JSONFind j = new JSONFind(finalURL);
        String StringSon = j.getJSON();
        StringSon = StringSon.substring(1,StringSon.length()-1);
        try{
            JSONObject CurSon = new JSONObject(StringSon);
            if(CurSon.get("PrecipitationType").equals(null)){
                this.pType = "none";
            }
            else{
            this.pType = CurSon.getString("PrecipitationType");
            }
        }
        catch (JSONException err){
            System.out.println(err);
            this.pType = "none";
         //commente dsad
        }
        System.out.println(this.pType);
    }
}
