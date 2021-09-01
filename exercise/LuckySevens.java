/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author junha
 */
public class LuckySevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGen = new Random(1001);
        
        // Scan how much money is held by the player
        System.out.println("How many dollars do you have?");
        float capital;
        while(true){
            try {
            capital = Float.parseFloat(scanner.nextLine());
            if (capital<1){
                System.out.println("Please enter valid number (1-infinity). How many dollars do you have?");
                continue;
            } 
            break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number (1-infinity). How many dollars do you have?");
                continue;
            }
        }
        
        // Play the game
        float maxHeld = capital;
        int maxGame = 0;
        int games = 0;
        while(capital>0){
            games++;
            // 1. Rolls 2 dice
            int dice1 = randomGen.nextInt(6) + 1;
            int dice2 = randomGen.nextInt(6) + 1;
            // 2. Calculate Gains & Loss
            if (dice1 + dice2 == 7){
                capital += 4;
                // 3. Update maxHeld when he gains money
                if (capital > maxHeld) {
                    maxHeld = capital;
                    maxGame = games;
                }
            }else{
                capital -= 1;
            }
        }
        
        // Print the result of the games
        System.out.println(String.format("You are broke after %d rolls.", games));
        System.out.println(String.format("You should have quit after %d rolls when you had $%.2f", maxGame, maxHeld));
    }
}
