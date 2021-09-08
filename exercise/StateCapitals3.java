/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author junha
 */
public class StateCapitals3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(
        new BufferedReader(new FileReader("C:\\Users\\junha\\Desktop\\JavaProjects\\basics\\src\\main\\java\\com\\sg\\foundations\\basics\\exercise\\MoreStateCapitals.txt")));
        // go through the file line by line
        Map<String,Capital> stateCapitals = new HashMap<String,Capital>();
        
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            Capital capital = new Capital(currentLine.split("::")[1], Integer.parseInt(currentLine.split("::")[2]), Double.parseDouble(currentLine.split("::")[3]));
            stateCapitals.put(currentLine.split("::")[0], capital);
        }
        // 1. Print all 50 states and capital info.
        
        System.out.println(stateCapitals.size() + " STATE/CAPITAL PAIRS LOADED.\n" + "==============================");
        
        for (String state : stateCapitals.keySet()){
            System.out.println(String.format("%s - %s | Pop: %d | Area: %.2f sq mi", state, stateCapitals.get(state).getName(), stateCapitals.get(state).getPopulation(), stateCapitals.get(state).getSquareMileage() ));
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the lower limit for capital city population: ");
        int populationLimit = Integer.parseInt(scanner.nextLine());
        
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN " + populationLimit + ":");
        for (String state : stateCapitals.keySet()){
            if(stateCapitals.get(state).getPopulation() >  populationLimit){
                System.out.println(String.format("%s - %s | Pop: %d | Area: %.2f sq mi", state, stateCapitals.get(state).getName(), stateCapitals.get(state).getPopulation(), stateCapitals.get(state).getSquareMileage() ));
            }
        }
        
        System.out.println("Please enter the upper limit for capital city sq mileage: ");
        double sqMilageLimit = Double.parseDouble(scanner.nextLine());
        
        System.out.println("LISTING CAPITALS WITH AREAS LESS THAN " + sqMilageLimit + ":");
        for (String state : stateCapitals.keySet()){
            if(stateCapitals.get(state).getSquareMileage() <  sqMilageLimit){
                System.out.println(String.format("%s - %s | Pop: %d | Area: %.2f sq mi", state, stateCapitals.get(state).getName(), stateCapitals.get(state).getPopulation(), stateCapitals.get(state).getSquareMileage() ));
            }
        }
    
    }
    
}
