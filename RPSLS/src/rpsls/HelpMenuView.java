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
     private final static String[][] menuItems = {
        {"G", "The game"},
        {"C", "A computer player"}, 
        {"A", "Attacks"},
        {"R", "A regular player"},        
        {"Q", "Quit Help"}        
    };
     String action;
     // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public String getInput() {       
        
       
        do {
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "G":
                       System.out.println("The game help");
//                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "C":
                     System.out.println("The computer help");
//                    this.helpMenuControl.displayComputerPlayerHelp();
                    break;
                case "A":
                     System.out.println("The attacks help");
//                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "R":
                     System.out.println("The player help");
//                    this.helpMenuControl.displayLocationHelp();
                    break;
                 case "Q": 
                     action = "QUIT";
                    return action;
            }
        } while (action != "QUIT");  
        
         return action;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
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
        String[][] items = HelpMenuView.menuItems;

        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}