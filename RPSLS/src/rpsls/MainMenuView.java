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
public class MainMenuView {
    
     private final static String[][] menuItems = {
        {"N", "New game"},
        {"H", "Help!"}, 
        {"Q", "Quit"}        
    };
     String action;
     // Create instance of the HelpMenuControl (action) class
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public String getInput() {       
        
       
        do {
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "N":
                        mainMenuControl.newGame();
                    break;
                case "H":
//                    System.out.println("");
                      mainMenuControl.getHelp();
                    break;                        
                case "Q": 
                     action = "QUIT";
                     System.out.println("Goodbye!");
                    return action;
            }
        } while (action != "QUIT");  
        
         return action;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
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
        String[][] items = MainMenuView.menuItems;

        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}