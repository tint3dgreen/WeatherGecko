/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geico;

/**
 *
 * @author Tyler
 */
class driverClass{
    public static void main(String args[]){
        testVariables test = new testVariables();
        test.initial();
        System.out.print(test.result);
    }
}

public class testVariables {
    String precipitationType, warning;
    double rainChance, snowChance, iceChance, rainAmount, snowAmount, iceAmount, temperature, visibility, windSpeed;
    int result;
    
    public void initial(){
        precipitationType = "Snow";
        warning = null;
        rainChance = 0;
        snowChance = 0.5; 
        iceChance = 0; 
        rainAmount = 0; 
        snowAmount = 3.0; 
        iceAmount = 0; 
        temperature = 23.5; 
        visibility = 10;
        windSpeed = 4;
        result = calcAutoRate();
    }
    
    public int calcAutoRate(){
        double rateAuto = 100;
        if(warning != null){
            System.out.print("\nAHHHHHH\n");
            rateAuto = 0;
        } 
        else
        {
            System.out.printf("%f%n",rateAuto);
            rateAuto = precipitate(rateAuto);
            System.out.printf("%f%n",rateAuto);
            rateAuto = temperature(rateAuto);
            System.out.printf("%f%n",rateAuto);
            if(visibility <= 2){
                if(visibility == 0){ rateAuto -= 50; }
                rateAuto -= 50;
            }
            System.out.printf("%f%n",rateAuto);
            if(windSpeed > 25){
                rateAuto -= 2 * (windSpeed - 25);
            }
            System.out.printf("%f%n",rateAuto);
        }
        if(rateAuto < 0){ rateAuto = 0;}
        System.out.printf("%f%n",rateAuto);
        
        return (int) rateAuto;
            
    }
    
    public double precipitate(double rate){
        switch(precipitationType){
            case("Rain"):
                rate -= 16.66 * Math.pow(rainChance, 1/rainChance) * Math.pow(rainAmount,rainAmount/6); break;
            case("Snow"):
                rate -= 25 * Math.pow(snowChance, 1/snowChance) * Math.pow(snowAmount,snowAmount/4); break;
            case("Ice"):
                rate -= 30; break;
            case("Mixed"):
                rate -= .5 * (16.66 * Math.pow(rainChance, 1/rainChance) * Math.pow(rainAmount,rainAmount/6) + 25 * Math.pow(snowChance, 1/snowChance) * Math.pow(snowAmount,snowAmount/4)); break;
        }
        return rate;
    }
    
    public double temperature(double rate){
        if(temperature < 32){
            rate -= Math.abs(32 - temperature);
        }
        return rate;
    }
    
    
    
}
