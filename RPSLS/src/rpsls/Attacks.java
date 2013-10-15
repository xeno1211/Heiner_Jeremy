/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Luke Brewer and Jeremy
 */
package rpsls;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jeremy
 */
public class Attacks {
    int attack;
    int b;
    String attackType;
    String commputerAttack;
    
    public char getAttack() {
        
        // THIS IS NEW CODING!!!!!
        int START = 1;
        int END = 5;
        char error = 'q';
        Random random = new Random();
        long range = (long)END - (long)START + 1;
        long fraction = (long)(range * random.nextDouble());
        b =  (int)(fraction + START);
        
        // THIS IS END OF NEW CODE!!!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your attack (1-5): ");
        this.attack = input.nextInt();
        if (this.attack <= 5 && this.attack > 0){
            if (this.attack == 1){
                attackType = "Rock";
            }
            else if (this.attack == 2){
                attackType = "Paper";
            }
            else if (this.attack == 3){
                attackType = "Scissors";
            }
            else if (this.attack == 5){
                attackType = "Lizard";
            }
            else if (this.attack == 4){
                attackType = "Spock";
            }
            if (b == 1){
                commputerAttack = "Rock";
            }
            else if (b == 2){
                commputerAttack = "Paper";
            }
            else if (b == 3){
                commputerAttack = "Scissors";
            }
            else if (b == 5){
                commputerAttack = "Lizard";
            }
            else if (b == 4){
                commputerAttack = "Spock";
            }
            System.out.println("\nYour attack is " + attackType + ". and your enemy has chosen "+ commputerAttack +".");
            Beating myBeating = new Beating();        
            myBeating.getdisplayHow(this.attack,b);
            error = myBeating.getBeating(this.attack,b);

        } 
        else{
            System.out.println("Illegal attack. Please try again.");
            getAttack();
        }
        return error;
    }
}
