/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author junha
 */
public class Factorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to factor?");
        
        int number;
        while(true){    
            try {
                number = Integer.parseInt(scanner.nextLine());
                if(number <= 0){
                    System.out.println("Please enter valid number (0-infinity)!!!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number (0-infinity)!!!");
            }
        }
        //1.Find Factors
        ArrayList<Integer> factors = factors(number);
        
        for (int i = 1; i <= number; i++) {
            if(number%i == 0){
                factors.add(i);
            }
        } 
        System.out.println("The factors of " + number + " are:");
        for (int factor : factors){
            System.out.print(factor + " ");
        }
        System.out.println("");
        System.out.println(number + " has " + factors.size() + " factors");
        
        if (checkPerfect(factors, number)){
            System.out.println(number + " is a perfect number.");
        }else{
            System.out.println(number + " is not a perfect number.");
        }
        
        if (checkPrime(factors)){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number.");
        }

        
    }
    /**
     * 
     * @param number Finding the factors of this number
     * @return ArrayList<Integer> of factors
     */
    public static ArrayList<Integer> factors(int number){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        
        for (int i = 1; i <= number; i++) {
            if(number%i == 0){
                factors.add(i);
            }
        } 
        return factors;
    }
    /**
     * 
     * @param factors Input ArrayList of Factors
     * @param number 
     * @return Boolean if the number is perfect
     */
    public static boolean checkPerfect(ArrayList<Integer> factors, int number){
        double sum = 0;
        for(int i = 0; i < factors.size(); i++)
            sum += factors.get(i);
        return sum == number ;
    }
    /**
     * 
     * @param factors
     * @return 
     */
    public static boolean checkPrime(ArrayList<Integer> factors){
        return factors.size() == 2 ;
    }
}


