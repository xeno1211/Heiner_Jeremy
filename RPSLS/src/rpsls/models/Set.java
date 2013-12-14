/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls.models;

import rpsls.enums.Winner;


/**
 *
 * @author Luke
 */
public class Set {
    private int player1Score;
    private int computerScore;
    
    public Set() {
        
    }
    
    public void addMatch(Match match) {
        if (match.getWinner() == Winner.PLAYER1) player1Score++;
        else if (match.getWinner() == Winner.PLAYER2) computerScore++;
        // Do nothing if a tie
    }

    /**
     * @return the player1Score
     */
    public int getPlayer1Score() {
        return player1Score;
    }

    /**
     * @return the computerScore
     */
    public int getComputerScore() {
        return computerScore;
    }
}
