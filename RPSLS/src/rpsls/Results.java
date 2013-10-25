// Luke Brewer and Jeremy
package rpsls;

public class Results{
    public void displayTextResult(int playerAttack,int computerAttack){
        
// normal play
        if ((playerAttack == 1 && computerAttack==2)||(playerAttack==2 && computerAttack==1))
            {
            System.out.println("Paper covers Rock");
            }
      
        else if ((playerAttack == 2 && computerAttack == 3)||(playerAttack == 3 && computerAttack == 2))
            {
            System.out.println("Scissors cuts paper");
            }
        
        else if ((playerAttack == 3 && computerAttack == 4)||(playerAttack == 4 && computerAttack == 3))
            {
            System.out.println("Spock smashes Scissors");
            }

        else if ((playerAttack == 4 && computerAttack == 5)||(playerAttack == 5 && computerAttack == 4))
            {
            System.out.println("Lizard poisons Spock");
            }

        //exceptions in the game i.e.
        else if ((playerAttack == 1 && computerAttack == 3)||(playerAttack == 3 && computerAttack == 1))
            {
            System.out.println("Rock crushes Scissors");
            }

        else if ((playerAttack == 2 && computerAttack == 4)||(playerAttack == 4 && computerAttack == 2))
            {
            System.out.println("Paper disproves Spock");
            }

        else if ((playerAttack == 3 && computerAttack == 5)||(playerAttack == 5 && computerAttack == 3))
            {
            System.out.println("Scissors decapitate Lizard");
            }
         else if ((playerAttack == 1 && computerAttack == 4)||(playerAttack == 4 && computerAttack == 1))
            {
            System.out.println("Spock vaporizes Rock"); 
            }
         
         else if ((playerAttack == 5 && computerAttack == 2)||(playerAttack == 2 && computerAttack == 5))
            {
            System.out.println("Lizard eats paper");
            }
         
         else if ((playerAttack == 5 && computerAttack == 1)||(playerAttack == 1 && computerAttack == 5))
            {
            System.out.println("Rock crushes Lizard");
            }
        
    }
    
    
// contingencies
    
    
    public char getResults(int playerAttack,int computerAttack){
        int playerScore = 0;
        int computerScore = 0;
        for (int i = 0; i<3; i++){
        
            if (playerAttack == computerAttack)
            {
                System.out.println("TIE");
                return 'T';
            }
            // Rock crushes scissors
            else if ((playerAttack == 1 && computerAttack == 3)||(playerAttack == 3 && computerAttack == 1))
            {
                // if player chose rock and comp chose scissors
                if (playerAttack == 1)
                {
                    System.out.println("WIN.");
                    playerScore ++;
                    return 'W';
                }
                // if player chose scissors and comp choose rock
                else
                {
                    System.out.println("LOSE.");
                    computerScore++;
                    return 'L';
                }
            }
            // Paper disproves Spock
            else if ((playerAttack == 2 && computerAttack == 4)||(playerAttack == 4 && computerAttack == 2))
            {
                // Player chose paper and comp chose Spock
                if (playerAttack == 2)
                {
                    System.out.println("WIN.");
                    playerScore++;
                    return 'W';
                }
                // Player chose Spock and comp chose paper
                else
                {
                    System.out.println("LOSE.");
                    computerScore++;
                    return 'L';
                }
            }
            // Scissors decaps lizard
            else if ((playerAttack == 3 && computerAttack == 5)||(playerAttack == 5 && computerAttack == 3))
            {
                // player chose scissors
                if (playerAttack == 3)
                {
                    System.out.println("WIN.");
                    playerScore++;
                    return 'W';
                }
                // player choose lizard
                else
                {
                    System.out.println("LOSE.");
                    computerScore++;
                    return 'L';
                }
            }
            // Spock vaporizes rock
             else if ((playerAttack == 1 && computerAttack == 4)||(playerAttack == 4 && computerAttack == 1))
            {
                // player chose Spock
                if (playerAttack == 4)
                {
                    System.out.println("WIN.");
                    playerScore++;
                    return 'W';
                }
                // Player chose rock
                else
                {
                    System.out.println("LOSE.");
                    computerScore++;
                    return 'L';
                }
            }

             // Lizard eats paper   
             else if ((playerAttack == 5 && computerAttack == 2)||(playerAttack == 2 && computerAttack == 5))
            {
                // player choose lizard
                if (playerAttack == 5)
                {
                    System.out.println("WIN.");
                    playerScore++;
                    return 'W';
                }
                // player chose paper
                else
                {
                    System.out.println("LOSE.");
                    computerScore++;
                    return 'L';
                }
            }

             // Rock crushes lizard
             else if ((playerAttack == 1 && computerAttack == 5)||(playerAttack == 5 && computerAttack == 1))
            {
                // player chose rock
                if (playerAttack == 1)
                {
                    System.out.println("WIN.");
                    playerScore++;
                    return 'W';
                }
                // player chose lizard
                else
                {
                    System.out.println("LOSE.");
                    computerScore++;
                    return 'L';
                }
            } 

            // All other options
            else if (playerAttack > computerAttack){


                System.out.println("WIN");
                playerScore++;
                return 'W';
            }
            else if (computerAttack > playerAttack)
            {
                System.out.println("LOSE");
                computerScore++;
                return 'L';
            }
            else {
                System.out.println("You chose an illegal attack, you automatically LOSE");
                return 'L';  
                }
            

        }
        return 'L';
    }

}

