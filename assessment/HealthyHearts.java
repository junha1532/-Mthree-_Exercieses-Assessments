/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.assessment;

import java.util.Scanner;

/**
 *
 * @author junha
 */
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        
        int age = Integer.parseInt(scanner.nextLine());
        int maxHeatBeat = 220-age;
        System.out.println(String.format("Your maximum heart rate should be %d beats per minute", maxHeatBeat));
        int min = (int) Math.round(0.5*(220-age));
        int max = (int) Math.round(0.85*(220-age));
        System.out.println(String.format("Your target HR Zone is %d - %d beats per minute", min, max));
    }
}
