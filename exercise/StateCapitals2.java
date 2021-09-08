/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author junha
 */
public class StateCapitals2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(
        new BufferedReader(new FileReader("C:\\Users\\junha\\Desktop\\JavaProjects\\basics\\src\\main\\java\\com\\sg\\foundations\\basics\\exercise\\StateCapitals.txt")));
        // go through the file line by line
        Map<String,String> stateCapitals = new HashMap<String,String>();
        
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            stateCapitals.put(currentLine.split("::")[0], currentLine.split("::")[1]);
        }
        System.out.println(
                "50 STATES & CAPITALS ARE LOADED.\n" + 
                "=======\n" + 
                "HERE ARE THE STATES :"
        );
        for (String state : stateCapitals.keySet()){
            System.out.print(state + ", ");
        }
        System.out.println("");
        // Prompt user to guess capital of random state
        
        Scanner scanner = new Scanner(System.in);
        Random randGen = new Random();
        
        int randIdx = randGen.nextInt(stateCapitals.keySet().size());
        Object states[] = stateCapitals.keySet().toArray();
        String randomState = (String) states[randIdx];
        
        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF " + randomState + "?");
        
        String input = scanner.nextLine();
        
        if (input.equals(stateCapitals.get(randomState))) {
            System.out.println("NICE WORK! " + input + " IS CORRECT!");
        }else{
            System.out.println("WRONG! " + stateCapitals.get(randomState) + " IS THE CAPITAL OF " + randomState + "!");
        }
        
    }
}
