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
public class RPSLS {
    String name;
    String instructions = "Rock = 1, paper = 2, scissors = 3, Spock = 4, lizard = 5";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char score[] = {'-','-','-','-','-'};
        RPSLS myGame = new RPSLS();
        myGame.getName();
        myGame.displayHelp();      
        Attacks myAttacks = new Attacks();
        for (int i = 0; i<5; i++)
        {
        
        score[i] = myAttacks.getAttack();
        System.out.println("\n" + score[0] + " " + score[1] + " " + score[2] + " " + score[3] + " " + score[4]);
        }
        
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