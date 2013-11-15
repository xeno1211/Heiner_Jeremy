/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class HelpMenuView {
    
   
     public static String[][] helpMenu = {
        {"G", "The game"},
        {"C", "A computer player"}, 
        {"A", "Attacks"},
        {"Q", "Quit Help"}        
    };

    /**
     * @return the helpMenu
     */
    private static String[][] getHelpMenu() {
        return helpMenu;
    }

    /**
     * @param aHelpMenu the helpMenu to set
     */
    private static void setHelpMenu(String[][] aHelpMenu) {
        helpMenu = aHelpMenu;
    }
     public String action;
     // Create instance of the HelpMenuControl (action) class
     public HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    public HelpMenuView() {
//        
        
    } 
    
    // display the help menu and get the end users input selection
    public String getHelpInput() {       
        
       
        do {           
            this.display();      
            
            // get commaned entered
            
            String command = this.getCommand();
           
            switch (command) {
                case "G":
                    this.getHelpMenuControl().displayGameHelp();
                    break;
                case "C":
                    this.getHelpMenuControl().displayComputerHelp();
                    break;
                case "A":
                    this.getHelpMenuControl().displayAttacksHelp();
                    break;                  
                case "Q": 
                     setAction("QUIT");
                    return getAction();
            }
        } while (getAction() != "QUIT");  
        
         return getAction();
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.getHelpMenu().length; i++) {
            System.out.println("\t   " + getHelpMenu()[i][0] + "\t" + getHelpMenu()[i][1]);
        }
        /*
        for (int g = 0; g<score[2]; g++){
                gamesPlayed[g] = helpMenu.gamesPlayed();
                System.out.println("you have played" + gamesPlayed[g] + "games, so far.");
        }
*/
        System.out.println("\t===============================================================\n");
    }

    
    
    // retrieves the command entered by the end user
    protected final String getCommand() {

//        Scanner inFile = myGame.getInputFile();
        Scanner input = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {

            command = input.next();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
//                new TicTacToeError().displayError("Invalid command. Please enter a valid command.");
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
    
    
    // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = HelpMenuView.getHelpMenu();

        for (String[] item : HelpMenuView.getHelpMenu()) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the action
     */
    private String getAction() {
        return action;
    }

    /**
     * @return the helpMenuControl
     */
    private HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }

    /**
     * @param action the action to set
     */
    private void setAction(String action) {
        this.action = action;
    }

    /**
     * @param helpMenuControl the helpMenuControl to set
     */
    private void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }
  
}