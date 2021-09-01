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
public class MiniMadLibs {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!");
        System.out.println("I need a noun:");
        String noun = scanner.nextLine();
        System.out.println("Now an adjective:");
        String adjective = scanner.nextLine();
        System.out.println("Another noun:");
        String noun2 = scanner.nextLine();
        System.out.println("And a number:");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Another adjective:");
        String adjective2 = scanner.nextLine();
        System.out.println("A plural noun:");
        String pluralNoun = scanner.nextLine();
        System.out.println("Another one:");
        String pluralNoun2 = scanner.nextLine();
        System.out.println("One more:");
        String pluralNoun3 = scanner.nextLine();
        System.out.println("A verb (infinitive form):");
        String verb = scanner.nextLine();
        System.out.println("Same verb (past participle):");
        String verbPast = scanner.nextLine();
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        
        System.out.println(String.format("%s: the %s frontier. These are the voyages of the starship %s. "
                + "Its %d-year mission: to explore strange %s %s, to seek out %s %s and %s %s, "
                + "to boldly %s where no one has %s before.",
                noun, adjective, noun2, number, adjective2, pluralNoun, adjective2, pluralNoun2, adjective2, pluralNoun3, verb, verbPast));

    }
}
