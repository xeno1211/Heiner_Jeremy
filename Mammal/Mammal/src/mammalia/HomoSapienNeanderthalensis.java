/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mammalia;

/**
 *
 * @author Xenocyde
 */
public class HomoSapienNeanderthalensis extends Mamalia {

    public HomoSapienNeanderthalensis(String name, String species, boolean isCaveMan, boolean isExtinct, boolean hasBigBrain, boolean isWarmBlooded,
            boolean hasHair, boolean hasLiveBirth) {
        
         super(name, species, isCaveMan, isExtinct, hasBigBrain, isWarmBlooded, hasHair, hasLiveBirth);
        
        
        
    }
    
    @Override
    public void output(){
        System.out.print(this.toString());
    }
    
    


}
