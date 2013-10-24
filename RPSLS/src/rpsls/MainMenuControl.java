/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

/**
 *
 * @author Jeremy
 */
public class MainMenuControl {
    


public MainMenuControl() {
        
    } 

    public void newGame() {
        char score[] = {'-','-','-'};
        Attacks myAttacks = new Attacks();
        // int i=-1;
       for (int i = 0; i<3; i++){  //while (i!=4){ 
           // i++;
            score[i] = myAttacks.getAttack();
            System.out.println("\n" + score[0] + " " + score[1] + " " + score[2]);
        }
       displayHelpBoarder();
       
    }
    public void getHelp() {
        HelpMenuView hMenu = new HelpMenuView();        
        hMenu.getHelpInput();
        
       
    }    
  
     public void displayHelpBoarder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}