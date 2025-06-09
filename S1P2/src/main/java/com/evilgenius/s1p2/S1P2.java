//  Project 002 -   Program the computer to verify the correct password. In this
//                  two-player exercise, one player gives hints ewhile the other
//                  player types-in password-guesses. The computer will let the 
//                  player know when he/ she is correct.

package com.evilgenius.s1p2;

import javax.swing.*;

public class S1P2 {

    public static void main(String[] args) {
        // variables:
        int secretPassword = 123456;
        int input;

        
        // input
        input = Integer.parseInt(JOptionPane.showInputDialog("What is your guess for the password?"));
        
        // Processing:
        while(input != secretPassword){
            if(input < secretPassword){
                System.out.println("You guessed wrong (too low)!");
            } else{
                System.out.println("You guessed wrong (too high)!");
            }
            
            input = Integer.parseInt(JOptionPane.showInputDialog("What is your new guess for the password?"));
        }
        
    }
}
