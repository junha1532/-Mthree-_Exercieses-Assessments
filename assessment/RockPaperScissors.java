/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.assessment;

import java.util.Random;
import java.util.Scanner;

/**
 *Please find the flowchart at README.md
 * @author junha
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        // Initialize Scanner and Random Object
        Scanner scanner = new Scanner(System.in);
        Random randomGen = new Random();
        
        // New game is created/played until the player decides to quit
        while (true){
            // 1. Ask player how many rounds he/she wants to play
            System.out.println("How many rounds do you want to play? Enter a value within 1-10 : ");
            
            int rounds = Integer.parseInt(scanner.nextLine());
            if (rounds<1 || rounds>10){
                System.out.println("Error : You entered value out of valid range (1-10).");
                break;
            } 
            
            // 2. Play each round of Rock, Paper, Scissors
            int computerWin = 0;
            int playerWin = 0;
            int draw = 0;
            String convertChoices[] = {"N/A", "Rock", "Paper", "Scissors"};
            for (int i = 0; i < rounds; i++) {
                System.out.println(String.format("Round %d! Please enter your choice (1: Rock, 2: Paper, 3: Scissors) : ", i+1));
                int playerChoice;
                while(true){
                    try {
                    playerChoice = Integer.parseInt(scanner.nextLine());
                    if (playerChoice<1 || playerChoice>3){
                        System.out.println("Please enter valid number! (1: Rock, 2: Paper, 3: Scissors)");
                        continue;
                    } 
                    break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter valid number! (1: Rock, 2: Paper, 3: Scissors)");
                        continue;
                    }
                }
            
                int computerChoice = randomGen.nextInt(3) + 1;
            
                // 3. Check the winner of the round
                System.out.println(String.format("I chose %s and you chose %s.",convertChoices[computerChoice], convertChoices[playerChoice]));

                switch (playerChoice){
                    case 1:
                        if(computerChoice==1){
                            System.out.println("This round, We drew!");
                            draw++;
                        }else if(computerChoice==2){
                            System.out.println("This round, I won!");
                            computerWin++;
                        }else{
                            System.out.println("This round, You won!");
                            playerWin++;
                        }
                        break;
                    case 2:
                        if(computerChoice==1){
                            System.out.println("This round, You won!");
                            playerWin++;
                        }else if(computerChoice==2){
                            System.out.println("This round, We drew!");
                            draw++;
                        }else{
                            System.out.println("This round, I won!");
                            computerWin++;
                        }
                        break;
                    case 3:
                        if(computerChoice==1){
                            System.out.println("This round, I won!");
                            computerWin++;
                        }else if(computerChoice==2){
                            System.out.println("This round, You won!");
                            playerWin++;
                        }else{
                            System.out.println("This round, We drew!");
                            draw++;
                        }
                        break;
                }
            }
            
            // 4. Display overall result of the game
            System.out.println(String.format("That was intense! We just finished our %d rounds.", rounds));
            System.out.println(String.format("I won : %d games. You won : %d games. We drew : %d games. And the winner is...", computerWin, playerWin, draw));
            if (playerWin > computerWin){
                System.out.println("Oh no.. You beat me!!!");
            }else if (playerWin < computerWin){
                System.out.println("Haha.. I beat you!!!");
            }else{
                System.out.println("That was close. We drew!!!");
            }
            
            //5. Ask if the player wants to play another game
            System.out.println("Would you like to play another game of Rock, Paper, Scissors with me? Enter yes or no");
            String playAnother;
            while(true){
                playAnother = scanner.nextLine();
                if (playAnother.equals("yes") || playAnother.equals("no")){
                    break;
                }else{
                    System.out.println("Please enter valid input! (yes or no)");
                }
            }
            // Exit game when player does not want to play another.
            if (playAnother.equals("no")){
                System.out.println("Thanks for playing!");
                break;
            }
        }
        
    }
}
