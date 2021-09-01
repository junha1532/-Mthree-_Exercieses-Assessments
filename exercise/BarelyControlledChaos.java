/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.util.Random;

/**
 *
 * @author junha
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = randomColor();
        String animal = randomAnimal();
        String colorAgain = randomColor(); // call color method again here
        int weight = randomNumber(5,200); // call number method,
            // with a range between 5 - 200
        int distance = randomNumber(10,20); // call number method,
            // with a range between 10 - 20
        int number = randomNumber(10000,20000); // call number method,
            // with a range between 10000 - 20000
        int time = randomNumber(2,6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static String randomAnimal(){
        Random randomGen = new Random();
        String[] animals = {"gorilla","cat","dog","whale","rabbit"};
        
        return animals[randomGen.nextInt(5)];
    }
    
    public static String randomColor(){
        Random randomGen = new Random();
        String[] colors = {"blue","red","purple","white","yellow"};
        
        return colors[randomGen.nextInt(5)];
    }
    
    public static int randomNumber(int min, int max){
        Random randomGen = new Random();
        return randomGen.nextInt(max - min + 1) + min;
    }
    
}
