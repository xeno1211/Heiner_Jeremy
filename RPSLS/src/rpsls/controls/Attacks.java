/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Luke Brewer and Jeremy
 */
package rpsls.controls;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Jeremy
 */
public class Attacks {
    private String attack;
    private int computerChoice;
    private String attackType;
    private String commputerAttack;
    
    public char getAttack() {
        
        int start = 1;
        int end = 5;
        char winner = 'L';
        Random random = new Random();
        long range = (long)end - (long)start + 1;
        long fraction = (long)(range * random.nextDouble());
        setComputerChoice((int)(fraction + start));
        
       
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your attack (1-5): ");
        this.setAttack(input.next());
        if(this.attack.matches("[0-9]")){
            // contains a number
            if (Integer.parseInt(this.attack) <= 5 && Integer.parseInt(this.attack) > 0){
                   if (Integer.parseInt(this.attack) == 1){
                       setAttackType("Rock");
                   }
                   else if (Integer.parseInt(this.attack) == 2){
                       setAttackType("Paper");
                   }
                   else if (Integer.parseInt(this.attack) == 3){
                       setAttackType("Scissors");
                   }
                   else if (Integer.parseInt(this.attack) == 5){
                       setAttackType("Lizard");
                   }
                   else if (Integer.parseInt(this.attack) == 4){
                       setAttackType("Spock");
                   }
                   if (getComputerChoice() == 1){
                       setCommputerAttack("Rock");
                   }
                   else if (getComputerChoice() == 2){
                       setCommputerAttack("Paper");
                   }
                   else if (getComputerChoice() == 3){
                       setCommputerAttack("Scissors");
                   }
                   else if (getComputerChoice() == 5){
                       setCommputerAttack("Lizard");
                   }
                   else if (getComputerChoice() == 4){
                       setCommputerAttack("Spock");
                   }
                   System.out.println("\nYour attack is " + getAttackType() + ". and your enemy has chosen "+ getCommputerAttack() +".");
                   Results getResults = new Results();        
                   getResults.displayTextResult(Integer.parseInt(this.attack), getComputerChoice());
                   winner = getResults.getResults(Integer.parseInt(this.attack), getComputerChoice());

               } 
               else{
                   System.out.println("Illegal attack. Please try again.");
                   
               }  
        }
        else{
             // does not contain a number        
            System.out.println("Illegal selection. Please type a number 1-5." );
             getAttack();  
             Results getResults = new Results();        
             getResults.displayTextResult(Integer.parseInt(this.attack), getComputerChoice());
             winner = getResults.getResults(Integer.parseInt(this.attack), getComputerChoice());
            
           
        }
        return winner;
    }

    /**
     * @return the computerChoice
     */
    private int getComputerChoice() {
        return computerChoice;
    }

    /**
     * @return the attackType
     */
    private String getAttackType() {
        return attackType;
    }

    /**
     * @return the commputerAttack
     */
    private String getCommputerAttack() {
        return commputerAttack;
    }

    /**
     * @param attack the attack to set
     */
    private void setAttack(String attack) {
        this.attack = attack;
    }

    /**
     * @param computerChoice the computerChoice to set
     */
    private void setComputerChoice(int computerChoice) {
        this.computerChoice = computerChoice;
    }

    /**
     * @param attackType the attackType to set
     */
    private void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    /**
     * @param commputerAttack the commputerAttack to set
     */
    private void setCommputerAttack(String commputerAttack) {
        this.commputerAttack = commputerAttack;
    }

    @Override
    public String toString() {
        return "Attacks{" + "attack=" + attack + ", computerChoice=" + computerChoice + ", attackType=" + attackType + ", commputerAttack=" + commputerAttack + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.attack);
        hash = 67 * hash + this.computerChoice;
        hash = 67 * hash + Objects.hashCode(this.attackType);
        hash = 67 * hash + Objects.hashCode(this.commputerAttack);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Attacks other = (Attacks) obj;
        if (!Objects.equals(this.attack, other.attack)) {
            return false;
        }
        if (this.computerChoice != other.computerChoice) {
            return false;
        }
        if (!Objects.equals(this.commputerAttack, other.commputerAttack)) {
            return false;
        }
        return true;
    }
    
}
