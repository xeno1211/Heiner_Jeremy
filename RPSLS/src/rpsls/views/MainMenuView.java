/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls.views;

import rpsls.controls.MainMenuControl;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import rpsls.exceptions.MenuException;

/**
 *
 * @author Jeremy
 */
public class MainMenuView extends Menu {
    
     public static final String[][] menuItems = {
        {"N", "New game"},
        {"H", "Help!"}, 
        {"Q", "Quit"}        
    };
     
     public MainMenuControl mainMenuControl = new MainMenuControl();
     
      public MainMenuView() {
        super(MainMenuView.menuItems);
    }

   
   
     public String action;
     // Create instance of the HelpMenuControl (action) class
    
    
    
    
    // display the help menu and get the end users input selection
    
     public String getInput() {        
        
       
        do {
            try {
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
            } catch (MenuException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (action != "QUIT");  
        
         return action;
    }

    @Override
    public void display(int playerAttack, int computerAttack) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
    

    
    
   
    
    
   
   

   
  
}