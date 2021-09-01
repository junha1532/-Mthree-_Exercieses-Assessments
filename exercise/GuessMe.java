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
public class GuessMe {
    
    public static void main(String[] args) {
        Random randGen = new Random(10001);
        Scanner scanner = new Scanner(System.in);
        System.out.println("I've chosen a number. Betcha can't guess it!");
        int guess;
        //
        int answer = randGen.nextInt(201) + -100;
        do{
            
            guess = Integer.parseInt(scanner.nextLine());
            if (guess==answer){
                System.out.println("You got it! My number was : " + guess);
                break;
            }
            if (guess<answer){
                System.out.println(guess + "? Ha, nice try - too low!");
            }
            if (guess>answer){
                System.out.println(guess + "? Ha, nice try - too high!");
            }
        }while(answer != guess);
        
        
    }
}
