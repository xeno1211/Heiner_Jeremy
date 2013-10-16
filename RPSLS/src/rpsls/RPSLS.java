/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Luke Brewer and Jeremy!
 */
package rpsls;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class RPSLS {
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char score[] = {'-','-','-','-','-'};
        RPSLS myGame = new RPSLS();
        Player newPlayer = new Player();
        newPlayer.getName();
        HelpMenuView menu = new HelpMenuView();        
        menu.getInput();   
        Attacks myAttacks = new Attacks();
        for (int i = 0; i<5; i++)
        {
        
        score[i] = myAttacks.getAttack();
        System.out.println("\n" + score[0] + " " + score[1] + " " + score[2] + " " + score[3] + " " + score[4]);
        }
        
    }
    
    
   
   
}
//
