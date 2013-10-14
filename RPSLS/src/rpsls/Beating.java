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
        else if ((a == 2 && b == 4)||(a == 4 && b == 2))
        {
            if (a == 2)
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
        else if ((a == 3 && b == 5)||(a == 5 && b == 3))
        {
            if (a == 3)
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
         else if ((a == 1 && b == 4)||(a == 4 && b == 1))
        {
            if (a == 4)
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
         
         else if ((a == 5 && b == 2)||(a == 2 && b == 5))
        {
            if (a == 5)
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
         
         else if ((a == 1 && b == 5)||(a == 5 && b == 1))
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
