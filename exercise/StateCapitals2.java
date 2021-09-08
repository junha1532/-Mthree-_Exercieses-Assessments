/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        // 1. Read StateCapitals.txt from absolute path to the working directory
        Scanner sc = new Scanner(
        new BufferedReader(new FileReader("C:\\Users\\junha\\Desktop\\JavaProjects\\basics\\src\\main\\java\\com\\sg\\foundations\\basics\\exercise\\StateCapitals.txt")));
        
        // 2. Instantiate a hashmap that will store key-value pair for each US state and its capital city
        Map<String,String> stateCapitals = new HashMap<String,String>();
        
        // 3. Our scanner reads Read StateCapitals.txt line by line and stores state/capital info to the hashmap
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            stateCapitals.put(currentLine.split("::")[0], currentLine.split("::")[1]);
        }
        System.out.println(
                "50 STATES & CAPITALS ARE LOADED.\n" + 
                "=======\n" + 
                "HERE ARE THE STATES :"
        );
        
        // 4. Print all states stored in hashmap
        for (String state : stateCapitals.keySet()){
            System.out.print(state + ", ");
        }
        System.out.println("");
        // Prompt user to guess capital of random state
        
        // 5. Instantiate Scanner and Random Generator Object
        Scanner scanner = new Scanner(System.in);
        Random randGen = new Random();
        
        // 6. Select Random State to question its capital city to the user 
        int randIdx = randGen.nextInt(stateCapitals.keySet().size());
        Object states[] = stateCapitals.keySet().toArray();
        String randomState = (String) states[randIdx];
        
        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF " + randomState + "?");
        // 7. Get user's answer
        String input = scanner.nextLine();
        
        // 8. Check the user's answer - Display Correct/Wrong
        if (input.equals(stateCapitals.get(randomState))) {
            System.out.println("NICE WORK! " + input + " IS CORRECT!");
        }else{
            System.out.println("WRONG! " + stateCapitals.get(randomState) + " IS THE CAPITAL OF " + randomState + "!");
        }
        
    }
}
