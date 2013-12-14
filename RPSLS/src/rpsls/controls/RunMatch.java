/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls.controls;

import java.util.Random;
import rpsls.enums.AttackType;
import rpsls.models.*;

/**
 *
 * @author Luke
 */
public class RunMatch {
    AttackType playerAttackType;
    AttackType computerAttackType;
    
    public RunMatch(AttackType attackType) {
        this.playerAttackType = attackType;
        this.computerAttackType = generateAttackType();
    }
    
    public Match run(Set set) {
        Attack playerAttack = new Attack(playerAttackType);
        Attack computerAttack = new Attack(computerAttackType);
        
        Match match = new Match(playerAttack, computerAttack);
        set.addMatch(match);
        return match;
    }
    
    private AttackType generateAttackType() {
        int end = 5;
        Random random = new Random();
        int attackType = random.nextInt(end) + 1; 
        return intToAttack(attackType);
    }
    
    public AttackType intToAttack(int num) {
       if (num == 1) return AttackType.ROCK;
       if (num == 2) return AttackType.PAPER;
       if (num == 3) return AttackType.SCISSORS;
       if (num == 4) return AttackType.LIZARD;
       return AttackType.SPOCK;
    }
        
}
