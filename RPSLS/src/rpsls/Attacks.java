/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Luke Brewer and Jeremy
 */
package rpsls;

import java.util.Scanner;
import java.util.Random;
import java.*;
/**
 *
 * @author Jeremy
 */
public class Attacks {
    String attack;
    int computerChoice;
    String attackType;
    String commputerAttack;
    
    public char getAttack() {
        
        // THIS IS NEW CODING!!!!!
        int START = 1;
        int END = 5;
        char error = 'Q';
        Random random = new Random();
        long range = (long)END - (long)START + 1;
        long fraction = (long)(range * random.nextDouble());
        computerChoice =  (int)(fraction + START);
        
        // THIS IS END OF NEW CODE!!!
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your attack (1-5): ");
        this.attack = input.next();
        if(this.attack.matches(".*\\d.*")){
            // contains a number
            if (Integer.parseInt(this.attack) <= 5 && Integer.parseInt(this.attack) > 0){
                   if (Integer.parseInt(this.attack) == 1){
                       attackType = "Rock";
                   }
                   else if (Integer.parseInt(this.attack) == 2){
                       attackType = "Paper";
                   }
                   else if (Integer.parseInt(this.attack) == 3){
                       attackType = "Scissors";
                   }
                   else if (Integer.parseInt(this.attack) == 5){
                       attackType = "Lizard";
                   }
                   else if (Integer.parseInt(this.attack) == 4){
                       attackType = "Spock";
                   }
                   if (computerChoice == 1){
                       commputerAttack = "Rock";
                   }
                   else if (computerChoice == 2){
                       commputerAttack = "Paper";
                   }
                   else if (computerChoice == 3){
                       commputerAttack = "Scissors";
                   }
                   else if (computerChoice == 5){
                       commputerAttack = "Lizard";
                   }
                   else if (computerChoice == 4){
                       commputerAttack = "Spock";
                   }
                   System.out.println("\nYour attack is " + attackType + ". and your enemy has chosen "+ commputerAttack +".");
                   Beating myBeating = new Beating();        
                   myBeating.getdisplayHow(Integer.parseInt(this.attack),computerChoice);
                   error = myBeating.getBeating(Integer.parseInt(this.attack),computerChoice);

               } 
               else{
                   System.out.println("Illegal attack. Please try again.");
                   getAttack();
               }  
        }
        else{
             // does not contain a number        
            System.out.println("Illegal selection. Please type a number 1-5." );
             getAttack();  
             Beating myBeating = new Beating();        
             myBeating.getdisplayHow(Integer.parseInt(this.attack),computerChoice);
             error = myBeating.getBeating(Integer.parseInt(this.attack),computerChoice);
            
           
        }
        return error;
    }
}
