/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.util.Scanner;

/**
 *
 * @author junha
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello there!");
        System.out.println("What is your name?");
        
        String name = scanner.nextLine();
        
        System.out.println(String.format("Hi, %s!  I'm Junha.\n" + "What's your favorite color?", name));
        String color = scanner.nextLine();
        
        System.out.println(String.format("Huh, %s? Mine's Electric Lime.", color));
        
        System.out.println(String.format("I really like limes. They're my favorite fruit, too.\n" +
            "What's YOUR favorite fruit, %s?", name));
        String fruit = scanner.nextLine();
        
        System.out.println(String.format("Really? %s? That's wild!\n" +
            "Speaking of favorites, what's your favorite number?", fruit));
        int number = Integer.parseInt(scanner.nextLine());
        
        System.out.println(String.format("%d is a cool number. Mine's -7.\n" +
            "Did you know %d * -7 is %d? That's a cool number too!", number, number, (number*-7)));
        
        System.out.println(String.format("Well, thanks for talking to me, %s!", name));
    }
}
