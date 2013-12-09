/*
 * This program takes user input of a number range
 * and calculates which numbers in range is prime.
 * Two or more primitive variable types.
   Two or more mathematical operators.
   At least one relational or logical operator.
   A type conversion using type casting.
   At least two character escape sequences.
 * Author: Jeremy Heiner 
 */
 
import java.util.Scanner;

public class prime {

    public static void main(String args[]) {
      
     //get input till which prime number to be printed
      System.out.println("\nEnter the number till which prime number to be printed: (number will be doubled) ");
      double limit_before= new Scanner(System.in).nextDouble();
      int limit_after = (int)limit_before;
      // For the requirements of this assignment, need another operator
      limit_after *= 2;
    
      //printing primer numbers till the limit_after ( 1 to ?)
      System.out.println("\nPrinting prime number from 1 to " + limit_after);
      for(int number = 2; number<=limit_after; number++){
          //print prime numbers only
          if(isPrime(number)){
              System.out.println(number);
          }
      }

    }

    /*
     * Prime number is not divisible by any number other than 1 and itself
     * @return true if number is prime
     */
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
           if(number%i == 0){
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
    }
}

