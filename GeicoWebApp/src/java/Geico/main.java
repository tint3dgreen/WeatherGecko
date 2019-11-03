package Geico;


/**
 *
 * @author Tyler
 */
public class main {
    
        public static void main(String args[]){
        String url = "http://dataservice.accuweather.com/locations/v1/postalcodes/search?apikey=2107FJxdeQ5VPtBxRFvxbopdusPRTJO1&q=17815";
        int timeout = 10000;
        JSONFind j = new JSONFind(url);
        String test = j.getJSON();
        System.out.print(test);
      
    }
        
        
        


}
   
    


