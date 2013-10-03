/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class RPSLS {
    String name;
    String instructions = "Rock = 1, paper = 2, scissors = 3, lizard = 4, Spock = 5";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RPSLS myGame = new RPSLS();
        myGame.getName();
        myGame.displayHelp();      
        Attacks myAttacks = new Attacks();
        myAttacks.getAttack();
        
    }
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    public void displayHelp(){
      System.out.println("\nWelcome " + this.name + "\n");
      System.out.println(this.instructions);
    }
}
//