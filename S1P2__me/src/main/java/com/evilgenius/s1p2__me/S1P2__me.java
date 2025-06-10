//  Project 002 -   Program the computer to verify the correct password. In this
//                  two-player exercise, one player gives hints ewhile the other
//                  player types-in password-guesses. The computer will let the 
//                  player know when he/ she is correct.

package com.evilgenius.s1p2__me;

import javax.swing.*;

public class S1P2__me {

    public static void main(String[] args) {
        
        // Variables:
        int secretPassword = 123456;
        int input;

        
        // Input:
        input = Integer.parseInt(JOptionPane.showInputDialog("What is your guess for the password (whole-number)?"));
        
        
        // Processing:
        while(input != secretPassword){
            if(input < secretPassword){
                JOptionPane.showMessageDialog(null, "You guessed wrong (too low)!");                
            } else{
                JOptionPane.showMessageDialog(null, "You guessed wrong (too high)!");
            }            
            input = Integer.parseInt(JOptionPane.showInputDialog("What is your new guess for the password?"));
        }
        
        
        // Output:
        JOptionPane.showMessageDialog(null, "You got it right, nice!");
    }
}