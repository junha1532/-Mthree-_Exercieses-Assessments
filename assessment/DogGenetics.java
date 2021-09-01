/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.assessment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author junha
 */
public class DogGenetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the dog's name as input 
        System.out.println("What is your dog's name?");
        String dogName = scanner.nextLine();
        
        // Generate random percentages that add up to 100
        int[] breedPctg = randPercentages(5);
        
        // Print Genetics Report
        System.out.println(String.format("Well then, I have this highly reliable report on %s's prestigious background right here.", dogName));
        System.out.println("");
        System.out.println(String.format("%s is:", dogName));
        System.out.println("");
        System.out.println(String.format("%d%% St. Bernard", breedPctg[0]));
        System.out.println(String.format("%d%% Chihuahua", breedPctg[1]));
        System.out.println(String.format("%d%% Dramatic RedNosed Asian Pug", breedPctg[2]));
        System.out.println(String.format("%d%% Common Cur", breedPctg[3]));
        System.out.println(String.format("%d%% King Doberman", breedPctg[4]));
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");
    }
    public static int[] randPercentages(int num){
        int randInts[] = new int[num];
        Random randomGen = new Random(1001);
        for (int i = 0; i < num; i++) {
            int sum=0;
            if (i==0) { 
                randInts[i] = randomGen.nextInt(101); 
                continue; }
            for (int j = 0; j < i; j++) {
                sum += randInts[j];
            }
            randInts[i] = randomGen.nextInt(101 - sum);
        }
        return  randInts;
    }
}

