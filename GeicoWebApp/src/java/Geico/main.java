package Geico;
import org.json.*;

/**
 *
 * @author Tyler
 */
public class main {
    
        public static void main(String args[]){
        String url = "http://dataservice.accuweather.com/forecasts/v1/hourly/1hour/335315?apikey=Bm6lcTWBL5oy8MiDnw8G4hCZlHC9xFya";
        int timeout = 10000;
        JSONFind j = new JSONFind(url);
        String test = j.getJSON();
        test = test.substring(1,test.length()-1);
//        System.out.println(test);
        try {
            JSONObject jsonObject = new JSONObject(test);
//            System.out.println(jsonObject);
            System.out.println(jsonObject.getJSONObject("Weather").get("Value"));
        }catch (JSONException err){
            System.out.println(err);
         //commente dsad
        }
        
        
      
    }
        
        
        


}
   
    


