/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Luke Brewer and Jeremy
 */
package rpsls;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class Player {

    private String name;
    private boolean validName = true;

    public String getName() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.setName(input.next());
        // If the name contains a digit OR a special character
        if (this.name.matches(".*\\d.*") || this.name.matches(".*\\W.*")) {
            System.out.println("Please enter a valid name. Names are only letters. No numbers or special characters.");
            setValidName(false);
        }
        // Until the name is valid run the loop
        while (!isValidName()) {
            System.out.println("Enter a VALID name: ");
            this.setName(input.next());
            // If the name contains a digit OR a special character run through the loop AGAIN...
            if (this.name.matches(".*\\d.*")|| this.name.matches(".*\\W.*")) {
                System.out.println("Please enter a valid name. Names are only letters. No numbers or special characters.");
                // continue = run through loop again
                continue;
            }
            else {
                // break = break out of the loop and resume running the code
                break;
            }
        }
        // Easter eggs
        if("Sheldon".equals(this.name)){
            System.out.println("Welcome, Dr. Cooper. Your brillance is going to make this game great! Unless of course Wil Wheaton is playing. Then you're doomed!");
        }
        else if("Raj".equals(this.name)){
            System.out.println("Welcome, Dr. Koothrappali. I hope you are drunk. There might be a girl here.");
        }
        else if("Howard".equals(this.name)){
            System.out.println("Welcome, MISTER Wolowitz. Go get your doctorate, you bum! Also, stop fantazing about Kara Thrace and George Takei!");
        }
        else if("Leonard".equals(this.name)){
            System.out.println("Welcome, Dr. Hofstadter. How's the roommate agreement treating you? Treat Penny well. You don't deserve her.");
        }
        else if("Penny".equals(this.name)){
            System.out.println("Welcome, Penny. Do you even have a last name? Stay with Leonard. He's better than your beefy boyfriends.");
        }
        else if("Amy".equals(this.name)){
           System.out.println("Welcome, Dr. Folwer. How can you stand to be Sheldon's girlfriend. Are you insane?!"); 
        }
        else if("Bernadette".equals(this.name)){
            System.out.println("Welcome, Dr. Rostenkowski-Wolowitz. Howard chose you over his hand and Kara Thrace. Don't you feel lucky?");
        }
        else if("Wil".equals(this.name)){
            System.out.println("Welcome, Wil. You're going to own Sheldon Cooper at this game.");
        }   
        
        else{
            System.out.println("\nWelcome " + this.name + "!\n");
        }
        return this.name;
    }

    /**
     * @return the validName
     */
    private boolean isValidName() {
        return validName;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * @param validName the validName to set
     */
    private void setValidName(boolean validName) {
        this.validName = validName;
    }
}
