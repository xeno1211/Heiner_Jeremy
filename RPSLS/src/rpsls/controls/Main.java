/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Luke Brewer and Jeremy!
 */
package rpsls.controls;

import java.util.Scanner;
import rpsls.exceptions.MenuException;
import rpsls.gui.PlayerNameFrame;
import rpsls.views.MainMenuView;
import rpsls.models.Player;
import rpsls.controls.Attacks;
import rpsls.controls.Results;

/**
 *
 * @author Jeremy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PlayerNameFrame playerFrame = new PlayerNameFrame();
        playerFrame.setVisible(true);

//       String resultsText = new ResultsText();
//        resultsText.setVisible(true);
//       String attackText = new AttackText();
//        attackText.setVisible(true);


//        MainMenuView menu = new MainMenuView();        
////         try {
//            menu.getInput();
////        } catch (MenuException mx) {
////            System.out.println(mx.getMessage());
////        }
////         
////        finally{
////        Main.inFile.close();    
////        }
//        
//       

    }

//    public static Scanner getInputFile() {
//        return Main.inFile;
//    }
    @Override
    public String toString() {
        return "Main{" + '}';
    }
}
//
