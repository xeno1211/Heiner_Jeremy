// Luke Brewer and Jeremy
package rpsls;

public class Beating{
    
    public char getBeating(int a,int b){
        if (a == b)
        {
            System.out.println("TIE");
            return 'T';
        }
        else if ((a == 1 && b == 3)||(a == 3 && b == 1))
        {
            if (a == 1)
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
        
        else if (a > b){
            System.out.println("WIN");
            return 'W';
        }
        else if (b > a)
        {
            System.out.println("LOSE");
            return 'L';
        }
        return 'q';
    }    
}
