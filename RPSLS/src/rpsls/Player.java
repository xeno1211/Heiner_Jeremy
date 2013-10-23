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
    boolean validName = true;

    public String getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        if (this.name.matches(".*\\d.*") || this.name.matches(".*\\W.*")) {
            System.out.println("Please enter a valid name. Names are only letters. No numbers or special characters.");
            validName = false;
        }
        while (!validName) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter a VALID name: ");
            this.name = input.next();
            if (this.name.matches(".*\\d.*")|| this.name.matches(".*\\W.*")) {
                System.out.println("Please enter a valid name. Names are only letters. No numbers or special characters.");
                continue;
            } else {
                break;
            }
        }
        System.out.println("\nWelcome " + this.name + "\n");
        return this.name;
    }
}
