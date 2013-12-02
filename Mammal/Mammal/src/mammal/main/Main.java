/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mammal.main;

import java.util.Objects;
import mammal.objects.HomoSapienNeanderthalensis;
import mammal.objects.HomoSapienSapien;

/**
 *
 * @author Xenocyde
 */
public abstract class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        HomoSapienNeanderthalensis fred = new HomoSapienNeanderthalensis("Fred Flintstone", "Homo Sapien Neanderthalensis (Neanderthal)", true, true, false, true, true, true);
        HomoSapienSapien jeremy = new HomoSapienSapien("Jeremy Heiner", "Homo Sapien Sapien (Human)", false, false, true, true, true, true);
        fred.display();
        jeremy.display();
        
    }
    
    

    
    
    
    
    
    
}
