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
public class UserIOImpl implements UserIO{
    
    private Scanner scanner;
    
    public UserIOImpl() {
        scanner = new Scanner(System.in);
    }
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        return input;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int input; 
        while(true){
            System.out.println(prompt + String.format("The range of valid input is (%d-%d)", min, max));
            input = Integer.parseInt(scanner.nextLine());
            if (input >= min && input <= max){
                break;
            }
        }
        return input;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double input = Double.parseDouble(scanner.nextLine());
        return input;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double input; 
        while(true){
            System.out.println(prompt + String.format("The range of valid input is (%.2f-%.2f)", min, max));
            input = Double.parseDouble(scanner.nextLine());
            if (input > min && input < max){
                break;
            }
        }
        return input;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float input = Float.parseFloat(scanner.nextLine());
        return input;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float input; 
        while(true){
            System.out.println(prompt + String.format("The range of valid input is (%.2f-%.2f)", min, max));
            input = Float.parseFloat(scanner.nextLine());
            if (input > min && input < max){
                break;
            }
        }
        return input;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long input = Long.parseLong(scanner.nextLine());
        return input;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long input; 
        while(true){
            System.out.println(prompt + String.format("The range of valid input is (%.2f-%.2f)", min, max));
            input = Long.parseLong(scanner.nextLine());
            if (input > min && input < max){
                break;
            }
        }
        return input;
    }
    
}
