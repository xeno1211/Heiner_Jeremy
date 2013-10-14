/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Luke Brewer and Jeremy
 */
package rpsls;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class Player {
    String name;
     public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        System.out.println("\nWelcome " + this.name + "\n");
    }
    
}
