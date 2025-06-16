/*
    Project 003 -   The program displays a simple math equation.
                    the player must solve the problem before the
                    computer counts-down from three and displays
                    correct answer. Can you beat the computer?
 */

package com.mycompany.project_003__me;

import javax.swing.*;

public class S1P3__me {

    public static void main(String[] args) throws Exception{
        
        // Variables
        // two numbers, for the simple mathematical equation.
        int num1 = (int) Math.round(Math.random() * 10);
        int num2 = (int) Math.round(Math.random() * 10);
        // the operator-sign for the simple mathematical-equation.
        int sign = (int) Math.round((Math.random() * (5 - 1)) + 1);
        // the answer of the simple mathematical-equation.
        int answer = 0;
        
        // Processing.
        switch(sign){
            case 1:
                JOptionPane.showMessageDialog(null, num1 +" + " +num2 +" = ");
                answer = (num1 + num2);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, num1 +" - " + num2 +" = ");
                answer = (num1 - num2);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, num1 +" * " +num2 +" = ");
                answer = (num1 * num2);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, num1 +" / " +num2 +" = ");
                answer = (num1 / num2);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, num1 +" % " +num2 +" = ");
                answer = (num1 % num2);
                break;
        }
        
        // Output.
        System.out.println("5...");
        Thread.sleep(1000);
                
        System.out.println("4...");
        Thread.sleep(1000);
        
        System.out.println("3...");
        Thread.sleep(1000);
        
        System.out.println("2...");
        Thread.sleep(1000);
        
        System.out.println("1...");
        Thread.sleep(1000);
        
        JOptionPane.showMessageDialog(null, "ANSWER = " +answer);
    }
}