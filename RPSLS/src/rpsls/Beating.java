// Luke Brewer and Jeremy
package rpsls;

public class Beating{
    public void getdisplayHow(int playerAttack,int computerAttack){
        
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
    
    
    public char getBeating(int playerAttack,int computerAttack){
        
        if (playerAttack == computerAttack)
        {
            System.out.println("TIE");
            return 'T';
        }
        else if ((playerAttack == 1 && computerAttack == 3)||(playerAttack == 3 && computerAttack == 1))
        {
            if (playerAttack == 1)
            {
                System.out.println("WIN.");
                return 'W';
            }
            else
            {
                System.out.println("LOSE.");
                return 'L';
            }
        }
        else if ((playerAttack == 2 && computerAttack == 4)||(playerAttack == 4 && computerAttack == 2))
        {
            if (playerAttack == 2)
            {
                System.out.println("WIN.");
                return 'W';
            }
            else
            {
                System.out.println("LOSE.");
                return 'L';
            }
        }
        else if ((playerAttack == 3 && computerAttack == 5)||(playerAttack == 5 && computerAttack == 3))
        {
            if (playerAttack == 3)
            {
                System.out.println("WIN.");
                return 'W';
            }
            else
            {
                System.out.println("LOSE.");
                return 'L';
            }
        }
         else if ((playerAttack == 1 && computerAttack == 4)||(playerAttack == 4 && computerAttack == 1))
        {
            if (playerAttack == 4)
            {
                System.out.println("WIN.");
                return 'W';
            }
            else
            {
                System.out.println("LOSE.");
                return 'L';
            }
        }

            else if ((playerAttack == 5 && computerAttack == 2)||(playerAttack == 2 && computerAttack == 5))
        {
            if (playerAttack == 5)
            {
                System.out.println("WIN.");
                return 'W';
            }
            else
            {
                System.out.println("LOSE.");
                return 'L';
            }
        }
         
         else if ((playerAttack == 1 && computerAttack == 5)||(playerAttack == 5 && computerAttack == 1))
        {
            if (playerAttack == 1)
            {
                System.out.println("WIN.");
                return 'W';
            }
            else
            {
                System.out.println("LOSE.");
                return 'L';
            }
        } 
         
        else if (playerAttack > computerAttack){


            System.out.println("WIN");
            return 'W';
        }
        else if (computerAttack > playerAttack)
        {
            System.out.println("LOSE");
            return 'L';
        }
        else {
            System.out.println("You chose an illegal attack, you automatically LOSE");
            return 'L';  
            }
    }
    
//    public void results(){
//        int playerScore = 0;
//        int computerScore = 0;
//        for (int i = 0; i<3; i++){
//            
//        }
//    }
   

    
}

