/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

/**
 *
 * @author Jeremy
 */
public class HelpMenuControl {
    


    public HelpMenuControl() {
        
    } 

    public void displayGameHelp() {
        System.out.println();                
        System.out.println( 
                "\t\"It’s very simple. Look, scissors cuts paper. Paper covers rock. "
                + "\n\tRock crushes lizard. Lizard poisons Spock. Spock smashes scissors. "
                + "\n\tScissors decapitates lizard. Lizard eats paper. Paper disproves Spock. "
                + "\n\tSpock vaporizes rock. And as it always has, rock crushes scissors.\"");
        displayHelpBoarder();
       
    }
    public void displayComputerHelp() {
        System.out.println();                
        System.out.println( 
                "\tThe computer uses a random number generator to choose its attack.");
        displayHelpBoarder();
       
    }    
   public void displayAttacksHelp() {
        System.out.println();                
        System.out.println( 
                "\tRock = 1 "
                + "\n\tPaper = 2 "
                + "\n\tScissors = 3 "
                + "\n\tSpock = 4 "
                + "\n\tLizard = 5");
        displayHelpBoarder();
       
    }
     public void displayHelpBoarder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}