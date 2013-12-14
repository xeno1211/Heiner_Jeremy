/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Luke Brewer and Jeremy
 */
package rpsls.controls;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import rpsls.enums.AttackType;
import rpsls.exceptions.NumberException;
import rpsls.views.HelpMenuView;

import rpsls.gui.GameFrame;//getting the player attacks from here ###################################

/**
 *
 * @author Jeremy
 */
public class Attacks {

    private String attack;
    private int computerChoice;
    private String attackType;
    private String commputerAttack;
    private int i = 0;

    public char getAttack() throws NumberException {

        int start = 1;
        int end = 5;
        char winner = '-';
        Random random = new Random();
        long range = (long) end - (long) start + 1;
        long fraction = (long) (range * random.nextInt());
        setComputerChoice((int) (fraction + start));



        Scanner input = new Scanner(System.in);
        System.out.println("Enter your attack (1-5): ");
        this.setAttack(input.next());
        if (this.attack.matches("[0-9]")) {


            try {
                // contains a number
//                int playerChoice = getPlayerChoice();//get the coice from GameFrame          // Old:    Integer.parseInt(this.attack);
                int computerChoice = getComputerChoice();

//                String playerString = translateChoice(playerChoice);
                String computerString = translateChoice(computerChoice);

//                setAttackType(playerString);
                setCommputerAttack(computerString);

                attackText = ("\nYour attack is " + getAttackType() + ". and your enemy has chosen " + getCommputerAttack() + ".");
                Results getResults = new Results();
                getResults.displayMatch(Integer.parseInt(this.attack), getComputerChoice());
                winner = getResults.getResults(Integer.parseInt(this.attack), getComputerChoice());

            } //the try closer
            catch (NumberException | NumberFormatException ex) {
                //Logger.getLogger(Attacks.class.getName()).log(Level.SEVERE, null, ex);
                attackText = ("Illegal attack. Please try again.");

            }
            //the do closer


            // while (Integer.parseInt(this.attack)!=1 || Integer.parseInt(this.attack)!=2 || Integer.parseInt(this.attack)!=3 ||Integer.parseInt(this.attack)!=4 ||Integer.parseInt(this.attack)!=5);


            //#######################################################################################       
        }//what your attack is closer 
        // If player picks a letter or special character
        else {
            // does not contain a number        

            attackText = ("Illegal selection. Please type a number 1-5.");

//             getAttack();  
//             Results getResults = new Results();        
//             getResults.display(Integer.parseInt(this.attack), getComputerChoice());
//             winner = getResults.getResults(Integer.parseInt(this.attack), getComputerChoice());
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

    private String translateChoice(int choice) throws NumberException {
        if (choice <= 5 && Integer.parseInt(this.attack) > 0) {
            if (choice == 1) {
                return "Rock";
            } else if (choice == 2) {
                return "Paper";
            } else if (choice == 3) {
                return "Scissors";
            } else if (choice == 5) {
                return "Lizard";
            } else if (choice == 4) {
                return "Spock";
            }
        }
        throw new NumberException();
    }
    String attackText = "Attack Jazz";
}
