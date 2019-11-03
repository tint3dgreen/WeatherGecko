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
class driverClass {

    public static void main(String args[]) {
        testVariables test = new testVariables();
        test.initial();
        System.out.print(test.autoResult);
        System.out.print('\n');
        System.out.print(test.boatResult);
        System.out.print('\n');
    }
}

public class testVariables {

    String precipitationType, warning;
    double rainChance, snowChance, iceChance, rainAmount, snowAmount, iceAmount, temperature, visibility, windSpeed, realFeelTemp;
    int UV, autoResult, boatResult;

    public void initial() {
        precipitationType = "Snow";
        warning = "uh oh";
        rainChance = 0;
        snowChance = 0.5;
        iceChance = 0;
        rainAmount = 0;
        snowAmount = 3.0;
        iceAmount = 0;
        temperature = 23.5;
        visibility = 2;
        windSpeed = 4;
        realFeelTemp = 20.3;
        UV = 3;
        autoResult = calcAutoRate();
        boatResult = calcBoatingRate();
    }

    public int calcAutoRate() {
        double rateAuto = 100;
        if (warning != null) {

            rateAuto = 0;
        } else {
            rateAuto = precipitate(rateAuto);

            rateAuto = temperature(rateAuto);

            if (visibility <= 2) {
                if (visibility == 0) {
                    rateAuto -= 50;
                }
                rateAuto -= 50;
            }

            if (windSpeed > 25) {
                rateAuto -= 2 * (windSpeed - 25);
            }
        }

        if (rateAuto < 0) {
            rateAuto = 0;
        }

        return (int) rateAuto;
    }

    public int calcBoatingRate() {
        double rateBoat = 100;
        if (warning != null) {
            rateBoat = 0;
        } else {
            rateBoat = precipitate(rateBoat);

            rateBoat = realFeelTemperature(rateBoat);

            rateBoat = UV(rateBoat);

            if (visibility <= 2) {
                if (visibility == 0) {
                    rateBoat -= 30;
                }
                rateBoat -= 20;
            }

            if (windSpeed > 9) {
                rateBoat -= (100 / 7) * (windSpeed - 9);
            }
        }

        if (rateBoat < 0) {
            rateBoat = 0;
        }

        return (int) rateBoat;
    }
    
    public int calcWellnessFitnessRate(){
        double fitnessRate = 100;
        
        if (warning != null) {
            fitnessRate = 0;
        } else {
            fitnessRate = precipitate(fitnessRate);

            fitnessRate = realFeelTemperature(fitnessRate);

            fitnessRate = UV(fitnessRate);

            if (windSpeed > 24) {
                fitnessRate -= (100 / 14) * (windSpeed - 24);
            }
        }

        if (fitnessRate < 0) {
            fitnessRate = 0;
        }
        
        return (int) fitnessRate;
    }
    
    public int calcMotercycleRate(){
        double motercycleRate = 100;
        
        if (warning != null) {
            System.out.print("\nAHHHHHH\n");
            motercycleRate = 0;
            System.out.printf("After warnings: %f%n", motercycleRate);
        } else {
            motercycleRate = precipitate(motercycleRate);
            
            motercycleRate = UV(motercycleRate);
            
            if(windSpeed > 24){
                motercycleRate -= (100/14) * (windSpeed - 24);
            }
            
            if (visibility <= 2) {
                if (visibility == 0) {
                    motercycleRate -= 50;
                }
                motercycleRate -= 50;
            }
            
            motercycleRate = realFeelTemperature(motercycleRate);
        }
        
        if (motercycleRate < 0) {
            motercycleRate = 0;
        }
        
        return (int) motercycleRate;
    }
    
    public int calcFlightRate(){
        double flightRate = 0;
        
        if (warning != null) {
            flightRate = 0;
        } else {
            
            flightRate = precipitate(flightRate);
            
            flightRate = temperature(flightRate);
            
            if (visibility <= 2) {
                if (visibility == 0) {
                    flightRate -= 50;
                }
                flightRate -= 50;
            }
        }
        
        if (flightRate < 0) {
            flightRate = 0;
        }
        
        return (int) flightRate;
    }

    public double precipitate(double rate) {
        switch (precipitationType) {
            case ("Rain"):
                rate -= 16.66 * Math.pow(rainChance, 1 / rainChance) * Math.pow(rainAmount, rainAmount / 6);
                break;
            case ("Snow"):
                rate -= 25 * Math.pow(snowChance, 1 / snowChance) * Math.pow(snowAmount, snowAmount / 4);
                break;
            case ("Ice"):
                rate -= 30;
                break;
            case ("Mixed"):
                rate -= .5 * (16.66 * Math.pow(rainChance, 1 / rainChance) * Math.pow(rainAmount, rainAmount / 6) + 25 * Math.pow(snowChance, 1 / snowChance) * Math.pow(snowAmount, snowAmount / 4));
                break;
        }
        return rate;
    }

    public double temperature(double rate) {
        if (temperature < 32) {
            rate -= 32 - temperature;
        }
        return rate;
    }

    public double realFeelTemperature(double rate) {
        if (realFeelTemp > 90) {
            rate -= Math.pow(1.35, realFeelTemp - 90);
        }

        if (realFeelTemp < 40) {
            rate -= Math.pow(1.12, 40 - realFeelTemp);
        }

        return rate;
    }

    public double UV(double rate) {
        if (UV > 30) {
            rate -= Math.pow(UV, 1.9) / 2;
        }
        return rate;
    }

}
