/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls.models;

import rpsls.enums.AttackType;
import rpsls.enums.Winner;

import rpsls.models.Player;


/**
 *
 * @author Luke
 */
public class Attack implements Comparable {
    
    private AttackType attackType;
    private Player player; 
    
    public Attack(AttackType attackType){
        this.attackType = attackType;
    } 

    /**
     * @return the attackType
     */
    public AttackType getAttackType() {
        return attackType;
    }

    @Override
    public int compareTo(Object object) {
        Attack other = (Attack)object;
        if (this.attackType == other.attackType) return 0;
        
        if(this.attackType == AttackType.ROCK && other.getAttackType() == AttackType.PAPER) return -1;
        if(this.attackType == AttackType.ROCK && other.getAttackType() == AttackType.SPOCK) return -1;
        
        if(this.attackType == AttackType.ROCK && other.getAttackType() == AttackType.SCISSORS) return 1;
        if(this.attackType == AttackType.ROCK && other.getAttackType() == AttackType.LIZARD) return 1;
        
        if(this.attackType == AttackType.PAPER && other.getAttackType() == AttackType.ROCK) return 1;
        if(this.attackType == AttackType.PAPER && other.getAttackType() == AttackType.SPOCK) return 1;
        
        if(this.attackType == AttackType.PAPER && other.getAttackType() == AttackType.SCISSORS) return -1;
        if(this.attackType == AttackType.PAPER && other.getAttackType() == AttackType.LIZARD) return -1;
        
        if(this.attackType == AttackType.SCISSORS && other.getAttackType() == AttackType.PAPER) return 1;
        if(this.attackType == AttackType.SCISSORS && other.getAttackType() == AttackType.LIZARD) return 1;
        
        if(this.attackType == AttackType.SCISSORS && other.getAttackType() == AttackType.ROCK) return -1;
        if(this.attackType == AttackType.SCISSORS && other.getAttackType() == AttackType.SPOCK) return -1;
        
        if(this.attackType == AttackType.LIZARD && other.getAttackType() == AttackType.PAPER) return 1;
        if(this.attackType == AttackType.LIZARD && other.getAttackType() == AttackType.SPOCK) return 1;
        
        if(this.attackType == AttackType.LIZARD && other.getAttackType() == AttackType.ROCK) return -1;
        if(this.attackType == AttackType.LIZARD && other.getAttackType() == AttackType.SCISSORS) return -1;
        
        if(this.attackType == AttackType.SPOCK && other.getAttackType() == AttackType.ROCK) return 1;
        if(this.attackType == AttackType.SPOCK && other.getAttackType() == AttackType.SCISSORS) return 1;
        
        if(this.attackType == AttackType.SPOCK && other.getAttackType() == AttackType.PAPER) return -1;
        if(this.attackType == AttackType.SPOCK && other.getAttackType() == AttackType.LIZARD) return -1;
        
        return 0;
    }
    
}
