/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls.controls;

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
        this.computerAttackType = AttackType.SCISSORS;
    }
    
    public Match run() {
        Attack playerAttack = new Attack(playerAttackType);
        Attack computerAttack = new Attack(computerAttackType);
        
        Match match = new Match(playerAttack, computerAttack);
        return new Match();
    }
}
