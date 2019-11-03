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

    

}
