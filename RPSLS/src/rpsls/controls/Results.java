// Luke Brewer and Jeremy
package rpsls.controls;

import rpsls.exceptions.NumberException;
import rpsls.interfaces.DisplayInfo;

public class Results implements DisplayInfo {

    @Override
    public void display(int playerAttack, int computerAttack) {



// normal play
        if ((playerAttack == 1 && computerAttack == 2) || (playerAttack == 2 && computerAttack == 1)) {
            resultsText = ("Paper covers Rock");
        } else if ((playerAttack == 2 && computerAttack == 3) || (playerAttack == 3 && computerAttack == 2)) {
            resultsText = ("Scissors cuts paper");
        } else if ((playerAttack == 3 && computerAttack == 4) || (playerAttack == 4 && computerAttack == 3)) {
            resultsText = ("Spock smashes Scissors");
        } else if ((playerAttack == 4 && computerAttack == 5) || (playerAttack == 5 && computerAttack == 4)) {
            resultsText = ("Lizard poisons Spock");
        } //exceptions in the game i.e.
        else if ((playerAttack == 1 && computerAttack == 3) || (playerAttack == 3 && computerAttack == 1)) {
            resultsText = ("Rock crushes Scissors");
        } else if ((playerAttack == 2 && computerAttack == 4) || (playerAttack == 4 && computerAttack == 2)) {
            resultsText = ("Paper disproves Spock");
        } else if ((playerAttack == 3 && computerAttack == 5) || (playerAttack == 5 && computerAttack == 3)) {
            resultsText = ("Scissors decapitate Lizard");
        } else if ((playerAttack == 1 && computerAttack == 4) || (playerAttack == 4 && computerAttack == 1)) {
            resultsText = ("Spock vaporizes Rock");
        } else if ((playerAttack == 5 && computerAttack == 2) || (playerAttack == 2 && computerAttack == 5)) {
            resultsText = ("Lizard eats paper");
        } else if ((playerAttack == 5 && computerAttack == 1) || (playerAttack == 1 && computerAttack == 5)) {
            resultsText = ("Rock crushes Lizard");
        }

    }

// contingencies
    public char getResults(int playerAttack, int computerAttack) throws NumberException {

        for (int i = 0; i < 3; i++) {

            if (playerAttack == computerAttack) {
                resultsText = ("You TIE this match.");
                return 'T';
            } // Rock crushes scissors
            else if ((playerAttack == 1 && computerAttack == 3) || (playerAttack == 3 && computerAttack == 1)) {
                // if player chose rock and comp chose scissors
                if (playerAttack == 1) {
                    resultsText = ("You WIN this match.");

                    return 'W';
                } // if player chose scissors and comp choose rock
                else {
                    resultsText = ("You LOSE this match.");

                    return 'L';
                }
            } // Paper disproves Spock
            else if ((playerAttack == 2 && computerAttack == 4) || (playerAttack == 4 && computerAttack == 2)) {
                // Player chose paper and comp chose Spock
                if (playerAttack == 2) {
                    resultsText = ("You WIN this match.");

                    return 'W';
                } // Player chose Spock and comp chose paper
                else {
                    resultsText = ("You LOSE this match.");

                    return 'L';
                }
            } // Scissors decaps lizard
            else if ((playerAttack == 3 && computerAttack == 5) || (playerAttack == 5 && computerAttack == 3)) {
                // player chose scissors
                if (playerAttack == 3) {
                    resultsText = ("You WIN this match.");

                    return 'W';
                } // player choose lizard
                else {
                    resultsText = ("You LOSE this match.");

                    return 'L';
                }
            } // Spock vaporizes rock
            else if ((playerAttack == 1 && computerAttack == 4) || (playerAttack == 4 && computerAttack == 1)) {
                // player chose Spock
                if (playerAttack == 4) {
                    resultsText = ("You WIN this match.");

                    return 'W';
                } // Player chose rock
                else {
                    resultsText = ("You LOSE this match.");

                    return 'L';
                }
            } // Lizard eats paper   
            else if ((playerAttack == 5 && computerAttack == 2) || (playerAttack == 2 && computerAttack == 5)) {
                // player choose lizard
                if (playerAttack == 5) {
                    resultsText = ("You WIN this match.");

                    return 'W';
                } // player chose paper
                else {
                    resultsText = ("You LOSE this match.");

                    return 'L';
                }
            } // Rock crushes lizard
            else if ((playerAttack == 1 && computerAttack == 5) || (playerAttack == 5 && computerAttack == 1)) {
                // player chose rock
                if (playerAttack == 1) {
                    resultsText = ("You WIN this match.");

                    return 'W';
                } // player chose lizard
                else {
                    resultsText = ("You LOSE this match.");

                    return 'L';
                }
            } // All other options
            else if (playerAttack > computerAttack) {


                resultsText = ("WIN");

                return 'W';
            } else if (computerAttack > playerAttack) {
                resultsText = ("LOSE");

                return 'L';
            } else {
                resultsText = ("You chose an illegal attack, you automatically LOSE");
                throw new NumberException("Error! Invalid attack choice!");
            }


        }
        throw new NumberException("Error! Invalid attack choice!");
    }
    String resultsText = "Results Jazz";
}
