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
   public void displayAttacksHelp() {
        System.out.println("Unsorted list: "); 
        System.out.println();                
        System.out.println( 
                "\tRock = 1 "
                + "\n\tPaper = 2 "
                + "\n\tScissors = 3 "
                + "\n\tSpock = 4 "
                + "\n\tLizard = 5");
        System.out.println("Sorted list: ");
       String[ ] attacks = {"Rock = 1", "Scissors = 3", "Spock = 4", "Lizard = 5"};
        sortStringBubble(attacks);
        for ( int k = 0;  k < 4;  k++ )
                System.out.println("\t" + attacks [ k ] );
        displayHelpBoarder();
       
    }
    public static void sortStringBubble( String  x [ ] )
      {
            int j;
            boolean flag = true;  // will determine when the sort is finished
            String temp;

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < x.length - 1;  j++ )
                  {
                          if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ j ];
                                      x [ j ] = x [ j+1];     // swapping
                                      x [ j+1] = temp; 
                                      flag = true;
                           } 
                   } 
            } 
      }
     public void displayHelpBoarder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}