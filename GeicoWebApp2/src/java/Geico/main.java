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
        Forecast F1 = new Forecast("335135");
        JSONFind w = new JSONFind("http://dataservice.accuweather.com/alarms/v1/1day/335315?apikey=Bm6lcTWBL5oy8MiDnw8G4hCZlHC9xFya");
        String StringSon = j.getJSON();
         //commente dsad
        }
        
        
      
    }
        

