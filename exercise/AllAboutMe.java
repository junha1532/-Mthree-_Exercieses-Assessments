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
public class AllAboutMe {
    public static void main(String[] args) {
        String name = "Junha Park";
        String food = "Creamy Chicken";
        int numPets = 0;
        String address = "Jupiter, Solar Compount Unit 101";
        String hobby = "Assemble Rockets";
        
        System.out.println(String.format("My name is %s.\n" +
           "My favorite food is %s.\n" +
            "I have %d pets.\n" +
            "I live in %s, and I love it here.\n" +
            "It is true I know how to %s.",name,food,numPets,address,hobby));
    }
}
