//  Project 003 -   The program displays a math equation.
//                  the player must solve the problem before the computer 
//                  counts-down from three and displays the correct answer.
//                  Can you beat the computer?

package com.mycompany.s1p3__book;

// first, allow for input
import javax.swing.*;

public class S1P3__book {

    // main method (throws Exception) added for Thread.sleep()
    public static void main(String[] args) throws Exception{
        
        // Variables
        
        // random number for the equation
        int num1 = (int) Math.round(Math.random() * 10);
        int num2 = (int) Math.round(Math.random() * 10);
        
        // random number for the mathematical operation
        int sign = (int) Math.round(Math.random() * 10);
        
        // will store the answer
        int answer;
        
        
        // Processing and Output
        // make stuff noticeable
        System.out.println("\n \n *****");
                
        if (sign == 0){
            // tell the user and calculate the answer
            System.out.println(num1 +" * " +num2);
            answer = (num1 * num2);
        }else if(sign == 1){
            // tell the user and calculate the answer
            System.out.println(num1 +" / " +num2);
            answer = (num1 / num2);
        }else if(sign == 2){
            // tell the user and calculate the answer
            System.out.println(num1 +" + " +num2);
            answer = (num1 + num2);
        }else if( sign == 3){
            // tell the user and calculate the answer
            System.out.println(num1 +" - " +num2);
            answer = (num1 - num2);
        }else{
            // tell the user and calculate the answer
            System.out.println(num1 +" % " +num2);
            answer = (num1 % num2);
        }
        
        // make it easier to read
        System.out.println("***** \n");
        
        
        // now, count down from three...
        System.out.println("3...");
        Thread.sleep(2000);
        System.out.println("2...");
        Thread.sleep(2000);
        System.out.println("1...");
        Thread.sleep(2000);
        
        // now, print the answer
        System.out.println("ANSWER = " +answer);
    }
}