/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.util.Scanner;

/**
 *
 * @author junha
 */
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How much do you want to invest?");
        float capital;
        while(true){
            try {
            capital = Float.parseFloat(scanner.nextLine());
            if (capital<0){
                System.out.println("Please enter valid number (0-infinity). How much do you want to invest?");
                continue;
            } 
            break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number (0-infinity). How much do you want to invest?");
                continue;
            }
        }
        
        System.out.println("How many years are investing?");
        int years;
        while(true){
            try {
            years = Integer.parseInt(scanner.nextLine());
            if (years<1 || years>100){
                System.out.println("Please enter valid number (1-100). How many years are investing?");
                continue;
            } 
            break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number (1-100). How many years are investing?");
                continue;
            }
        }
        
        System.out.println("What is the annual interest rate % growth?");
        float growthRate;
        while(true){
            try {
            //Input in Percentage
            growthRate = Float.parseFloat(scanner.nextLine()) / 100;
            if (growthRate<0){
                System.out.println("Please enter valid number (0-infinity). What is the annual interest rate % growth?");
                continue;
            } 
            break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number (0-infinity). What is the annual interest rate % growth?");
                continue;
            }
        }
        
        System.out.println("Calculating...");
        for (int i = 1; i <= years; i++) {
            System.out.println("Year " + i + ":");
            System.out.println(String.format("Began with $%.2f",capital));
            System.out.println(String.format("Earned $%.2f",annualGain(capital,growthRate)));
            System.out.println(String.format("Ended with $%.2f",capital+annualGain(capital,growthRate)));
            //New Capital = Capital + Annual Gain
            capital = capital + annualGain(capital,growthRate);
        }
    }
    public static float annualGain(float inputCapital,float growthRate){
        float capital = inputCapital; 
        for (int i = 0; i < 4; i++) {
            capital += capital * 0.25 * growthRate; 
        }
        return capital - inputCapital;
    }
}
