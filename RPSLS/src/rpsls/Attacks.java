/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jeremy
 */
public class Attacks {
    int rock = 1;
    int paper = 2;
    int scissors = 3;
    int lizard = 4;
    int spock = 5;
    int attack;
    int b;
    
    public char getAttack() {
        
        // THIS IS NEW CODING!!!!!
        int START = 1;
        int END = 5;
        char meow = 'q';
        Random random = new Random();
        long range = (long)END - (long)START + 1;
        long fraction = (long)(range * random.nextDouble());
        b =  (int)(fraction + START);
        
        // THIS IS END OF NEW CODE!!!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your attack (1-5): ");
        this.attack = input.nextInt();
        if (this.attack <= 5){
        System.out.println("\nYour attack is " + this.attack + ". and your enemy has chosen "+ b +".");
        Beating myBeating = new Beating();
        meow = myBeating.getBeating(this.attack,b);

        } 
        else{
            System.out.println("Illegal attack. Please try again.");
            getAttack();
        }
        return meow;
    }
}