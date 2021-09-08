/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author junha
 */
public class StudentQuizGrades {
    public static void main(String[] args) {
        UserIO userIO = new UserIOImpl();
        Map<String,ArrayList<Integer>> studentScores = new HashMap<String,ArrayList<Integer>>();
        
        // 1. This app continues to ask what to do until user QUITS
        while(true){
            // 2. Ask what the user would like to do AND 3. Get handle accordingly with switch-case  
            switch(userIO.readInt("What should I do? (Enter 1: View a list of students, 2: Add a student, 3: Remove a student, 4: Add student's quiz score, 5: View a list of quiz scores of a student, 6: View the average quiz score of a student",1,6)){
                case 1:
                    System.out.println("The students in our system are: ");
                    for (String student: studentScores.keySet()){
                        System.out.println(student);
                    }
                    break;      
                case 2:
                    String nameAdd = userIO.readString("What is the name of the student to add?");
                    studentScores.put(nameAdd, new ArrayList<Integer>());
                    System.out.println("New student - " + nameAdd + " added!");
                    break;
                case 3:
                    String nameRemove = userIO.readString("What is the name of the student to remove?");
                    studentScores.remove(nameRemove);
                    System.out.println("Student - " + nameRemove + " removed!");
                    break;
                case 4:
                    String nameAddScore = userIO.readString("What is the name of the student?");
                    int score = userIO.readInt("What is the score of the student?");
                    studentScores.get(nameAddScore).add(score);
                    System.out.println("Score - " + score + " added to student - " + nameAddScore + "!");
                    break;
                case 5:
                    String nameShowScores = userIO.readString("What is the name of the student?");
                    System.out.println("Student - " + nameShowScores + "'s scores are: ");
                    for(int eachScore : studentScores.get(nameShowScores)){
                        System.out.println(eachScore);
                    }
                    break;
                case 6:
                    String nameAvgScore = userIO.readString("What is the name of the student?");
                    int sum = 0;
                    for (int mark : studentScores.get(nameAvgScore)) {
                        sum += mark;
                    }
                    System.out.println("Student - " + nameAvgScore + "'s average score is : " + (double)sum / studentScores.get(nameAvgScore).size());
                    break;
            }
            
            if (userIO.readString("Would you like to quit? (Enter: yes or no)").equals("yes")){
                break;
            }
        }
    }
}
