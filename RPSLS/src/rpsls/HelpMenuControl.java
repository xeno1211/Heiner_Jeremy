/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

/**
 *
 * @author Jeremy
 */
public class HelpMenuControl {
    


    public HelpMenuControl() {
        
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
   public String[] displayAttacksHelp() {
        System.out.println("Unsorted list: "); 
        System.out.println();                
        System.out.println( 
                "\tRock = 1 "
                + "\n\tPaper = 2 "
                + "\n\tScissors = 3 "
                + "\n\tSpock = 4 "
                + "\n\tLizard = 5");
        System.out.println("Sorted list: ");
       String[ ] attacks = {"Rock = 1", "Paper = 2", "Scissors = 3", "Spock = 4", "Lizard = 5"};
       sortStringBubble(attacks);
        for ( int k = 0;  k < 5;  k++ )
                System.out.println("\t" + attacks [ k ] );
        testSort(attacks);
        return attacks;
       
    }
    public static void sortStringBubble( String  attacks [ ] )
      {
            int j;
            boolean flag = true;  // will determine when the sort is finished
            String temp;

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < attacks.length - 1;  j++ )
                  {
                          if ( attacks [ j ].compareToIgnoreCase( attacks [ j+1 ] ) > 0 )
                          {                                             // ascending sort
                                      temp = attacks [ j ];
                                      attacks [ j ] = attacks [ j+1];     // swapping
                                      attacks [ j+1] = temp; 
                                      flag = true;
                           } 
                   } 
            } 
      }
    public static void testSort(String attacks []){
        System.out.println(attacks[0]);
        if ("Lizard = 5".equals(attacks[0]) && "Paper = 2".equals(attacks[1]) && "Rock = 1".equals(attacks[2]) 
                && "Scissors = 3".equals(attacks[3]) && "Spock = 4".equals(attacks[4])){
            System.out.println("It worked.");
        }
        else{
             System.out.println("It didn't work.");
        }
    }
     private void displayHelpBoarder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public String toString() {
        return "HelpMenuControl{" + '}';
    }
     
}