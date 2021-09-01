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
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        int endCondition;
        
        while(true){
            try {
                endCondition = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please Enter Valid Number 0-infinity!!!");
            }
        }
        
        int fizzBuzzCounter = 0;
        int currNum = 0;
        while(endCondition != fizzBuzzCounter){
            if(currNum==0){
                System.out.println(currNum);
                currNum++;
                continue;
            }
            if (currNum%3 == 0 && currNum%5 ==0){
                System.out.println("fizz buzz");
                fizzBuzzCounter++;
            }else if(currNum%3 == 0){
                System.out.println("fizz");
                fizzBuzzCounter++;
            }else if(currNum%5 == 0){
                System.out.println("buzz");
                fizzBuzzCounter++;
            }else{
                System.out.println(currNum);
            }
            currNum++;
        }
        System.out.println("TRADITION!!!!!");
    }
}
