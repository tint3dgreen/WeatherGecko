package Geico;
import org.json.*;

/**
 *
 * @author Tyler
 */
public class main {
    
        public static void main(String args[]){
        String url = "http://dataservice.accuweather.com/forecasts/v1/hourly/1hour/335315?apikey=Bm6lcTWBL5oy8MiDnw8G4hCZlHC9xFya&details=true";
        int timeout = 10000;
        JSONFind j = new JSONFind(url);
        String test = j.getJSON();
        test = test.substring(1,test.length()-1);
        System.out.println(test);
        Location L1 = new Location("16801");
        WeatherAlert A1 = new WeatherAlert("335135");
        CurrentConditions C1 = new CurrentConditions("335135");
        try {
            JSONObject jsonObject = new JSONObject(test);
//            System.out.println(jsonObject);
            Forecast f1 = new Forecast(
                                        jsonObject.getString("DateTime"),
                                        jsonObject.getInt("EpochDateTime"),
                                        jsonObject.getJSONObject("Temperature").getDouble("Value"),
                                        jsonObject.getJSONObject("Temperature").getString("Unit"),
                                        jsonObject.getInt("PrecipitationProbability"),
                                        jsonObject.getInt("RelativeHumidity"),
                                        jsonObject.getJSONObject("RealFeelTemperature").getInt("Value"),
                                        jsonObject.getInt("UVIndex"),
                                        jsonObject.getJSONObject("WindGust").getJSONObject("Speed").getInt("Value"),
                                        jsonObject.getJSONObject("Rain").getInt("Value"),
                                        jsonObject.getJSONObject("Snow").getInt("Value"),
                                        jsonObject.getJSONObject("Ice").getInt("Value"),
                                        jsonObject.getJSONObject("Visibility").getDouble("Value"));
        }catch (JSONException err){
            System.out.println(err);
         //commente dsad
        }
        
        
      
    }
        
        
        


}
   
    


