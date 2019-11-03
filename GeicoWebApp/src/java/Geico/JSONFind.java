/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tyler
 */
public class JSONFind {
    
    String url;
    int timeout = 10000;
    
    public JSONFind(String newUrl){
        this.url = newUrl;
    }
    
    public  String getJSON() {
    HttpURLConnection c = null;
    try {
        URL u = new URL(url);
        c = (HttpURLConnection) u.openConnection();
        c.setRequestMethod("GET");
        c.setRequestProperty("Content-length", "0");
        c.setUseCaches(false);
        c.setAllowUserInteraction(false);
        c.setConnectTimeout(timeout);
        c.setReadTimeout(timeout);
        c.connect();
        int status = c.getResponseCode();

        switch (status) {
            case 201:
            case 200:
                BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                br.close();
                return sb.toString();
        }

    } catch (MalformedURLException ex) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
    } finally {
       if (c != null) {
          try {
              c.disconnect();
          } catch (Exception ex) {
             Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
          }
       }
    }
    return null;
}
}
