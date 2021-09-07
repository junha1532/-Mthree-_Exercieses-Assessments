/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author junha
 */
public class DogGenetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGen = new Random();
        
        // Get the dog's name as input 
        System.out.println("What is your dog's name?");
        String dogName = scanner.nextLine();
        
        // Print Genetics Report
        System.out.println(String.format("Well then, I have this highly reliable report on %s's prestigious background right here.", dogName));
        System.out.println("");
        System.out.println(String.format("%s is:", dogName));
        System.out.println("");
        
        // Pring 4 dogs
        int numDogs = 4;
        // Generate random percentages that add up to 100
        int[] breedPctg = randPercentages(numDogs);
        String[] breeds_array = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman", "Bull Dog"};
        ArrayList<String> breeds = new ArrayList<>(Arrays.asList(breeds_array));
        
        for (int i = 0; i < numDogs; i++) {
            int index = randomGen.nextInt(breeds.size());
            System.out.println(String.format("%d%% %s", breedPctg[i], breeds.get(index)));
            breeds.remove(index);
        }
        
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");
    }
    public static int[] randPercentages(int num){
        int randInts[] = new int[num];
        Random randomGen = new Random();
        for (int i = 0; i < num; i++) {
            int sum=0;
            if (i==0) { 
                randInts[i] = randomGen.nextInt(101); 
                continue; }
            for (int j = 0; j < i; j++) {
                sum += randInts[j];
            }
            // The last percentage is always 100 - sum of previous percentages
            if(i==num-1){
                randInts[i] = 100 - sum;
                break;
            }
            // Generate random number from range of (0, 100 - sum of previous percentages)
            randInts[i] = randomGen.nextInt(101 - sum);
        }
        return  randInts;
    }
}

