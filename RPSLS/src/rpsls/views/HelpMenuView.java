/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls.views;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import rpsls.exceptions.MenuException;

/**
 *
 * @author Jeremy
 */
public class HelpMenuView extends Menu {

    public static final String[][] menuItems = {
        {"G", "The game"},
        {"C", "A computer player"},
        {"A", "Attacks"},
        {"Q", "Quit Help"}
    };
    String action;

    public HelpMenuView() {
        super(HelpMenuView.menuItems);
//        

    }

    // display the help menu and get the end users input selection
    @Override
    public String getInput() {


        do {
            try {
                this.display();

                // get commaned entered

                String command = this.getCommand();

                switch (command) {
                    case "G":
                        displayGameHelp();
                        break;
                    case "C":
                        displayComputerHelp();
                        break;
                    case "A":
                        displayAttacksHelp();
                        break;
                    case "Q":
                        action = "QUIT";
                        return action;
                }
            } catch (MenuException ex) {
                Logger.getLogger(HelpMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (action != "QUIT");

        return action;
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
        System.out.println("Unsorted list: ");
        System.out.println();
        System.out.println(
                "\tRock = 1 "
                + "\n\tPaper = 2 "
                + "\n\tScissors = 3 "
                + "\n\tSpock = 4 "
                + "\n\tLizard = 5");


    }

    private void displayHelpBoarder() {
        System.out.println(
                "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public void displayMatch(int playerAttack, int computerAttack) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}