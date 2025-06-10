//  Project 002 -   Program the computer to verify the correct password. In this
//                  two-player exercise, one player gives hints ewhile the other
//                  player types-in password-guesses. The computer will let the 
//                  player know when he/ she is correct.

package com.evilgenius.s1p2;

// first, allow for input-getting:
import javax.swing.*;

// create a class named S1P2:
public class S1P2__book {

    // 'main' method:
    public static void main(String[] args) {
        
        // variables:
        
        // this String will hold the user's input:
        String input;
        
                
        // input
        // get input now:
        input = JOptionPane.showInputDialog("Enter the secret-message: ");
        
        // Processing:
        // test for correctness, "Evil Genius" is my secret-message:
        if(input.equals("Evil Genius")){            
            // user got it right, so tell him/ her:
            JOptionPane.showMessageDialog(null, "YOU GOT THE SECRET-MESSAGE!");
        }else{
            // if user got it wrong, tell him/ her:
            JOptionPane.showMessageDialog(null,  "WRONG! Hahaha!");
        }
    }
}
