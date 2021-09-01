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
public class DoItBetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey! How many miles can you run?");
        int miles = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("HAHAHA I can run %d miles!! SO, how many hotdoges can you eat?", miles*2));
        int hotdogs = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("I eat %d hot dogs one one shot!! How many languages do you speak?", hotdogs*2));
        int languages = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("Do it better!! I can speak %d languages", (languages*2)));
    }   
}
