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
    
    
    public String getMatchDescription() {
        String player1String = attackToString(this.player1Attack.getAttackType());
        String computerString = attackToString(this.computerAttack.getAttackType());
        String description = getDescription();
        String victoryString = victoryString();
        
        return "Your attack was: "
                + player1String
                + "\nThe computer chose: " 
                + computerString
                + "\n" + description
                + "\n" + victoryString;
    }
    
    public String attackToString(AttackType attackType) {
        if (attackType == AttackType.ROCK) return "ROCK";
        if (attackType == AttackType.PAPER) return "PAPER";
        if (attackType == AttackType.SCISSORS) return "SCISSORS";
        if (attackType == AttackType.LIZARD) return "LIZARD";
        return "SPOCK";
        
    }
    
    public String victoryString() {
        if (this.getWinner() == Winner.PLAYER1) return "You win!";
        if (this.getWinner() == Winner.PLAYER2) return "You lose!";
        return "Tie game!";
    }
    
    private String getDescription() {
        String resultsText = "We messed up";
        if ((player1Attack.getAttackType() == AttackType.PAPER && computerAttack.getAttackType() == AttackType.ROCK) || (player1Attack.getAttackType() == AttackType.ROCK && computerAttack.getAttackType() == AttackType.PAPER)) {
            resultsText = ("Paper covers Rock");
        } else if ((player1Attack.getAttackType() == AttackType.PAPER && computerAttack.getAttackType() == AttackType.SCISSORS) || (player1Attack.getAttackType() == AttackType.SCISSORS && computerAttack.getAttackType() == AttackType.PAPER)) {
            resultsText = ("Scissors cuts paper");
        } else if ((player1Attack.getAttackType() == AttackType.SCISSORS && computerAttack.getAttackType() == AttackType.SPOCK) || (player1Attack.getAttackType() == AttackType.SPOCK && computerAttack.getAttackType() == AttackType.SCISSORS)) {
            resultsText = ("Spock smashes Scissors");
        } else if ((player1Attack.getAttackType() == AttackType.SPOCK && computerAttack.getAttackType() == AttackType.LIZARD) || (player1Attack.getAttackType() == AttackType.LIZARD && computerAttack.getAttackType() == AttackType.SPOCK)) {
            resultsText = ("Lizard poisons Spock");
        } //exceptions in the game i.e.
        else if ((player1Attack.getAttackType() == AttackType.ROCK && computerAttack.getAttackType() == AttackType.SCISSORS) || (player1Attack.getAttackType() == AttackType.SCISSORS && computerAttack.getAttackType() == AttackType.ROCK)) {
            resultsText = ("Rock crushes Scissors");
        } else if ((player1Attack.getAttackType() == AttackType.PAPER && computerAttack.getAttackType() == AttackType.SPOCK) || (player1Attack.getAttackType() == AttackType.SPOCK && computerAttack.getAttackType() == AttackType.PAPER)) {
            resultsText = ("Paper disproves Spock");
        } else if ((player1Attack.getAttackType() == AttackType.SCISSORS && computerAttack.getAttackType() == AttackType.LIZARD) || (player1Attack.getAttackType() == AttackType.LIZARD && computerAttack.getAttackType() == AttackType.SCISSORS)) {
            resultsText = ("Scissors decapitate Lizard");
        } else if ((player1Attack.getAttackType() == AttackType.ROCK && computerAttack.getAttackType() == AttackType.SPOCK) || (player1Attack.getAttackType() == AttackType.SPOCK && computerAttack.getAttackType() == AttackType.ROCK)) {
            resultsText = ("Spock vaporizes Rock");
        } else if ((player1Attack.getAttackType() == AttackType.LIZARD && computerAttack.getAttackType() == AttackType.PAPER) || (player1Attack.getAttackType() == AttackType.PAPER && computerAttack.getAttackType() == AttackType.LIZARD)) {
            resultsText = ("Lizard eats paper");
        } else if ((player1Attack.getAttackType() == AttackType.LIZARD && computerAttack.getAttackType() == AttackType.ROCK) || (player1Attack.getAttackType() == AttackType.ROCK && computerAttack.getAttackType() == AttackType.LIZARD)) {
            resultsText = ("Rock crushes Lizard");
        }
        
        return resultsText;
    }
    
}
