// Luke Brewer and Jeremy
package rpsls;

public class Beating{
    
    public char getBeating(int playerScore,int computerScore){
        if (playerScore == computerScore)
        {
            System.out.println("TIE");
            return 'T';
        }
        else if ((playerScore == 1 && computerScore == 3)||(playerScore == 3 && computerScore == 1))
        {
            if (playerScore == 1)
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
        
        else if (playerScore > computerScore){
            System.out.println("WIN");
            return 'W';
        }
        else if (computerScore > playerScore)
        {
            System.out.println("LOSE");
            return 'L';
        }
        return 'q';
    }    
}
