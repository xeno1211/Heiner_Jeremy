/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls.models;

import rpsls.enums.*;



/**
 *
 * @author Luke
 */
public class Match {
    Attack player1Attack;
    Attack computerAttack;
    
    public Match(Attack playerAttack, Attack computerAttack) {
        this.player1Attack = playerAttack;
        this.computerAttack = computerAttack;
    }
    
    public Winner getWinner(){
        int victory = this.player1Attack.compareTo(this.computerAttack);
        if (victory == 1) return Winner.PLAYER1;
        if (victory == 0) return Winner.TIE;
        return Winner.PLAYER2;
    }
            
    
    //playerAttack attack;
   // playe2rAttack attack;
    
    
    //get String string;
    //get winner
    
}
