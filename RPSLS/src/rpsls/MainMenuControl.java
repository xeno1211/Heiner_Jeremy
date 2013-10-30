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
        int tiedScore = 0;
        Attacks myAttacks = new Attacks();
        // int i=-1;
       for (int i = 0; i<3; i++){  //while (i!=4){ 
           // i++;
            score[i] = myAttacks.getAttack();
            System.out.println("\n" + score[0] + " " + score[1] + " " + score[2]);
            
            // Player wins game
            if (score[i] == 'W'){
                playerScore++;
                
                if (playerScore >= 2){
                   System.out.println("Player won!");
                   System.out.println("Player score: " + playerScore);
                   System.out.println("Computer score: " +computerScore);
                   System.out.println("Tied score: " + tiedScore);                           
                    break;
                }
                else if (tiedScore == 2 && playerScore == 1){
                    System.out.println("Player won!");
                   System.out.println("Player score: " + playerScore);
                   System.out.println("Computer score: " +computerScore);
                   System.out.println("Tied score: " + tiedScore);
                  
                   
                    
               }
                
                
            }
            // Computer wins game
            else if (score[i] == 'L'){
                computerScore++;
               
                if (tiedScore == 2 && computerScore == 1){
                    System.out.println("Computer won!");
                    System.out.println("Player score: " + playerScore);
                   System.out.println("Computer score: " +computerScore);
                   System.out.println("Tied score: " + tiedScore);         
                    
               }
                    
                }
                else if (computerScore >= 2){
                    System.out.println("Computer won!");
                    System.out.println("Player score: " + playerScore);
                   System.out.println("Computer score: " +computerScore);
                   System.out.println("Tied score: " + tiedScore);
                    break;
            }
            // Tie game
            else if (score[i] == 'T'){
                tiedScore++;
                if (tiedScore == 1 && computerScore == 1 && playerScore == 1){
                    System.out.println("Tie Game!");
                    System.out.println("Player score: " + playerScore);
                   System.out.println("Computer score: " +computerScore);
                   System.out.println("Tied score: " + tiedScore);
                   
                   
                    
               }
                else if (tiedScore == 3){
                    System.out.println("Tie Game!");
                    System.out.println("Player score: " + playerScore);
                   System.out.println("Computer score: " +computerScore);
                   System.out.println("Tied score: " + tiedScore);
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