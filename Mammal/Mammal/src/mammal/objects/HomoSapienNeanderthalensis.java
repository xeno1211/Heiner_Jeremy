/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mammal.objects;

import mammal.control.Mamalia;
import mammal.interfaces.Output;

/**
 *
 * @author Xenocyde
 */
public class HomoSapienNeanderthalensis extends Mamalia implements Output {

    public HomoSapienNeanderthalensis(String name, String species, boolean isCaveMan, boolean isExtinct, boolean hasBigBrain, boolean isWarmBlooded,
            boolean hasHair, boolean hasLiveBirth) {
        
         super(name, species, isCaveMan, isExtinct, hasBigBrain, isWarmBlooded, hasHair, hasLiveBirth);
        
        
        
    }
    
   

    @Override
    public void display() {
        System.out.print(this.toString());
    }
    
    


}
