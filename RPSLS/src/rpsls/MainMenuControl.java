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
        int playerScore = 0;
        int computerScore = 0;
        Attacks myAttacks = new Attacks();
        // int i=-1;
       for (int i = 0; i<3; i++){  //while (i!=4){ 
           // i++;
            score[i] = myAttacks.getAttack();
            System.out.println("\n" + score[0] + " " + score[1] + " " + score[2]);
            
            if (score[i] == 'W'){
                playerScore++;
                if (playerScore >= 2){
                   System.out.println("Player won!");
                    break;
                }
                
                
            }
            else if (score[i] == 'L'){
                computerScore++;
                if (computerScore >= 2){
                    System.out.println("Computer won!");
                    break;
                }
            }
            
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