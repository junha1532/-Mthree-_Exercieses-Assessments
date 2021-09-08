/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author junha
 */
public class StateCapitals {
    public static void main(String[] args) {
        Map<String, String> stateCapitals = new HashMap<String, String>();
        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        System.out.println(stateCapitals);
        
        // 1. Print all of the state names
        System.out.println("STATES:\n=======");
        for(String state : stateCapitals.keySet()){
            System.out.println(state);
        }
        
        
        // 2. Print all of the capital names
        System.out.println("");
        System.out.println("CAPITALS:\n=========");
        for(String state : stateCapitals.keySet()){
            System.out.println(stateCapitals.get(state));
        }
        
        // 3. Print each state along with its capital
        System.out.println("");
        System.out.println("STATE/CAPITAL PAIRS:\n====================");
        for(String state : stateCapitals.keySet()){
            System.out.println(state + " - " + stateCapitals.get(state));
        }
    }
}
