package mammalia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xenocyde
 */
public class HomoSapienSapien extends Mammalia {
    
   public HomoSapienSapien(String name,String species, boolean isCaveMan, boolean isExtinct, boolean hasBigBrain, boolean isWarmBlooded,
            boolean hasHair, boolean hasLiveBirth) {
        Mammalia human = new Mammalia();
         human.setName(name);
         human.setSpecies(species);
         human.setIsCaveMan(isCaveMan);  
         human.setIsExtinct(isExtinct);  
         human.setHasBigBrain(hasBigBrain);  
         human.setIsWarmBlooded(isWarmBlooded);  
         human.setHasHair(hasHair);  
         human.setHasLiveBirth(hasLiveBirth);  
         
         human.output();
   }
    
}
