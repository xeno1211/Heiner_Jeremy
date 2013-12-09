/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberoperations;

/**
 *
 * @author Jeremy
 */
public class NumberOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        numberOutput();
        
    }
    public static void numberOutput(){
       Double[] numbers = {2.5, 5.0, 5.1, 103.0, 32.0, 23.5, 0.0, -4.0, 3.0, 6.0, 7.0, 46.0}; 
       double sum = forEachNumber(numbers);
       System.out.println("The sum of the numbers is: " + sum);
       testCases(sum);
    }
    public static double forEachNumber(Double[] numbers){
        double sum = 0;
           
        
        for (double i : numbers) {  // i gets successively each value in numbers.
            sum += i;
//            System.out.println(sum);
            
        }
        return sum;
        
    }
    public static void testCases(double sum){
        if (sum == 229.1){
            System.out.println("The sum is correct.");
        }
        else{
            System.out.println("The sum is wrong.");
        }
    }
}
