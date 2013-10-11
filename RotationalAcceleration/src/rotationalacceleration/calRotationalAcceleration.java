/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rotationalacceleration;

/**
 *
 * @author Jeremy
 */
public class calRotationalAcceleration {
    float startingVelocity;
    float finalVelocity;
    float rotationalAcceleration;
    float radius;
    float rotationsPerSecond;
    
    public void test1(){
        System.out.println("Start of test 1");
        startingVelocity = 1;
        rotationsPerSecond = 300;
        radius = 11;
        rotationalAcceleration = rotationsPerSecond * radius;
        finalVelocity = rotationalAcceleration + rotationsPerSecond;
        
        if (startingVelocity < 0){
            System.out.println("Sorry, you can't go negative speed.");
         }
        if (finalVelocity < startingVelocity)
        {
            System.out.println("Slowing down is not an option! Fully speed ahead, Mr. Sulu");
            
        }
        if (rotationalAcceleration > 3000){
            System.out.println("It's over 3000!");
        }
        if (rotationalAcceleration < 10){
            System.out.println("Congrats, you failed");
        }
        System.out.println("End of test 1");
        
    }
    public void test2(){
        System.out.println("Start of test 2");
        startingVelocity = 50;
        rotationsPerSecond = 1;
        radius = 1;
        rotationalAcceleration = rotationsPerSecond * radius;
        finalVelocity = rotationalAcceleration + rotationsPerSecond;
        
        if (startingVelocity < 0){
            System.out.println("Sorry, you can't go negative speed.");
         }
        if (finalVelocity < startingVelocity)
        {
            System.out.println("Slowing down is not an option! Fully speed ahead, Mr. Sulu");
            
        }
        if (rotationalAcceleration > 3000){
            System.out.println("It's over 3000!");
        }
        if (rotationalAcceleration < 10){
            System.out.println("Congrats, you failed");
        }
        System.out.println("End of test 2");
    }
    public void test3(){
        System.out.println("Start of test 3");
        startingVelocity = -300;
        rotationsPerSecond = 100;
        radius = 3;
        rotationalAcceleration = rotationsPerSecond * radius;
        finalVelocity = rotationalAcceleration + rotationsPerSecond;
        
        if (startingVelocity < 0){
            System.out.println("Sorry, you can't go negative speed.");
         }
        if (finalVelocity < startingVelocity)
        {
            System.out.println("Slowing down is not an option! Fully speed ahead, Mr. Sulu");
            
        }
        if (rotationalAcceleration > 3000){
            System.out.println("It's over 3000!");
        }
        if (rotationalAcceleration < 10){
            System.out.println("Congrats, you failed");
        }
        System.out.println("End of test 3");
    }
     public void test4(){
        System.out.println("Start of test 4");
        startingVelocity = 1;
        rotationsPerSecond = 300;
        radius = 1;
        rotationalAcceleration = rotationsPerSecond * radius;
        finalVelocity = rotationalAcceleration + rotationsPerSecond;
        
        if (startingVelocity < 0){
            System.out.println("Sorry, you can't go negative speed.");
         }
        if (finalVelocity < startingVelocity)
        {
            System.out.println("Slowing down is not an option! Fully speed ahead, Mr. Sulu");
            
        }
        if (rotationalAcceleration > 3000){
            System.out.println("It's over 3000!");
        }
        if (rotationalAcceleration < 10){
            System.out.println("Congrats, you failed");
        }
        System.out.println("End of test 4");
    }
}


