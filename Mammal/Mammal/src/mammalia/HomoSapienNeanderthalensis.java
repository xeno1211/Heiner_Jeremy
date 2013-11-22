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
public class HomoSapienNeanderthalensis extends Mammalia {

    public HomoSapienNeanderthalensis(String name, String species, boolean isCaveMan, boolean isExtinct, boolean hasBigBrain, boolean isWarmBlooded,
            boolean hasHair, boolean hasLiveBirth) {
        
         Mammalia caveMan = new Mammalia();
         caveMan.setName(name);
         caveMan.setSpecies(species);
         caveMan.setIsCaveMan(isCaveMan);  
         caveMan.setIsExtinct(isExtinct);  
         caveMan.setHasBigBrain(hasBigBrain);  
         caveMan.setIsWarmBlooded(isWarmBlooded);  
         caveMan.setHasHair(hasHair);  
         caveMan.setHasLiveBirth(hasLiveBirth);  
         
         
         caveMan.output();
        
    }
    
    
    
    
   

    
    
}
