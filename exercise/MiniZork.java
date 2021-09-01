/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

/**
 *
 * @author junha
 */
import java.util.Random;
import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {
        Random randGen = new Random(1001);
        int stop = 0;
        int start = randGen.nextInt(89 - 13 + 1) + 13;
        System.out.println("Counting down...");
        for(int i = start; i > stop-1; i--){
            if (i%2 != 0){
                System.out.println("it loves me!");
            }else{
                System.out.println("It loves me NOT!");
            }   
        }
        if (start%2 != 0) {
            System.out.println("Awwww, bummer.");
        }else{
            System.out.println("Oh, wow! It really LOVES me!");
        }
    } 
    
}
