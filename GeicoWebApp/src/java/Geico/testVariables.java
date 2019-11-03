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
            System.out.print("\nAHHHHHH\n");

            rateAuto = 0;
            System.out.printf("After Warning: %f%n", rateAuto);
        } else {
            rateAuto = precipitate(rateAuto);

            System.out.printf("After precipitatie: %f%n", rateAuto);

            rateAuto = temperature(rateAuto);

            System.out.printf("After temperature: %f%n", rateAuto);

            if (visibility <= 2) {
                if (visibility == 0) {
                    rateAuto -= 50;
                }
                rateAuto -= 50;
            }

            System.out.printf("After visibility: %f%n", rateAuto);

            if (windSpeed > 25) {
                rateAuto -= 2 * (windSpeed - 25);
            }

            System.out.printf("After wind speed: %f%n", rateAuto);
        }

        if (rateAuto < 0) {
            rateAuto = 0;
        }

        System.out.printf("Final value: %f%n%n", rateAuto);

        return (int) rateAuto;
    }

    public int calcBoatingRate() {
        double rateBoat = 100;
        if (warning != null) {
            System.out.print("\nAHHHHHH\n");
            rateBoat = 0;
            System.out.printf("After warnings: %f%n", rateBoat);
        } else {
            rateBoat = precipitate(rateBoat);

            System.out.printf("After precipitation: %f%n", rateBoat);

            rateBoat = realFeelTemperature(rateBoat);

            System.out.printf("After real feel temperature: %f%n", rateBoat);

            rateBoat = UV(rateBoat);

            if (visibility <= 2) {
                if (visibility == 0) {
                    rateBoat -= 30;
                }
                rateBoat -= 20;
            }

            System.out.printf("After visibility: %f%n", rateBoat);

            if (windSpeed > 9) {
                rateBoat -= (100 / 7) * (windSpeed - 9);
            }

            System.out.printf("After wind speed: %f%n", rateBoat);
        }

        if (rateBoat < 0) {
            rateBoat = 0;
        }

        System.out.printf("Final value: %f%n%n", rateBoat);

        return (int) rateBoat;
    }
    
    public int calcWellnessFitnessRate(){
        double fitnessRate = 100;
        
        if (warning != null) {
            System.out.print("\nAHHHHHH\n");
            fitnessRate = 0;
            System.out.printf("After warnings: %f%n", fitnessRate);
        } else {
            fitnessRate = precipitate(fitnessRate);

            System.out.printf("After precipitation: %f%n", fitnessRate);

            fitnessRate = realFeelTemperature(fitnessRate);

            System.out.printf("After real feel temperature: %f%n", fitnessRate);

            fitnessRate = UV(fitnessRate);

            System.out.printf("After visibility: %f%n", fitnessRate);

            if (windSpeed > 24) {
                fitnessRate -= (100 / 14) * (windSpeed - 24);
            }

            System.out.printf("After wind speed: %f%n", fitnessRate);
        }

        if (fitnessRate < 0) {
            fitnessRate = 0;
        }

        System.out.printf("Final value: %f%n%n", fitnessRate);

        return (int) fitnessRate;
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
            rate -= Math.abs(32 - temperature);
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
