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
    
     public static String[][] menuItems = {
        {"N", "New game"},
        {"H", "Help!"}, 
        {"Q", "Quit"}        
    };

    /**
     * @return the menuItems
     */
    private static String[][] getMenuItems() {
        return menuItems;
    }

    /**
     * @param aMenuItems the menuItems to set
     */
    private static void setMenuItems(String[][] aMenuItems) {
        menuItems = aMenuItems;
    }
     public String action;
     // Create instance of the HelpMenuControl (action) class
    public MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public  String getInput() {       
        
       
        do {
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "N":
                        getMainMenuControl().newGame();
                    break;
                case "H":
//                    System.out.println("");
                      getMainMenuControl().getHelp();
                    break;                        
                case "Q": 
                     setAction("QUIT");
                     System.out.println("Goodbye!");
                    return getAction();
            }
        } while (getAction() != "QUIT");  
        
         return getAction();
    }

        // displays the help menu
    private final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.getMenuItems().length; i++) {
            System.out.println("\t   " + getMenuItems()[i][0] + "\t" + getMenuItems()[i][1]);
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
        String[][] items = MainMenuView.getMenuItems();

        for (String[] item : MainMenuView.getMenuItems()) {
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
     * @return the mainMenuControl
     */
    private MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    /**
     * @param action the action to set
     */
    private void setAction(String action) {
        this.action = action;
    }

    /**
     * @param mainMenuControl the mainMenuControl to set
     */
    private void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }
  
}