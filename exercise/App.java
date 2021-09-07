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
public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();
        
        while(true){
            // 1. Get operations to perform
            System.out.println("Please chose one of the operations. (1: Addition, 2:Subtraction, 3: Multiplication, 4: Division, 5: Exit): ");
            int choice;
            while(true){
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (0 < choice && choice < 6){
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Please enter valid input (1-5). (1: Addition, 2:Subtraction, 3: Multiplication, 4: Division, 5: Exit): ");
                }
            }
            if (choice==5){
                System.out.println("Thanks for trying my simple calculator!!!");
                break;
            }
            // 2. Get num 1 as input
            System.out.println("Please enter one number: ");
            double num1;
            while(true){
                try {
                    num1 = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter valid input (-infinity ~ +infitity): ");
                }
            }
            // 2. Get num 1 as input
            System.out.println("Please enter another number: ");
            double num2;
            while(true){
                try {
                    num2 = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter valid input (-infinity ~ +infitity): ");
                }
            }
            // 3. Output the result
            switch(choice){
                case(1):System.out.println("The result is : " + calculator.addition(num1,num2)); break;
                case(2):System.out.println("The result is : " + calculator.subtraction(num1,num2)); break;
                case(3):System.out.println("The result is : " + calculator.multiplication(num1,num2)); break;
                case(4):System.out.println("The result is : " + calculator.division(num1,num2)); break;
            }
        }
    }
}
