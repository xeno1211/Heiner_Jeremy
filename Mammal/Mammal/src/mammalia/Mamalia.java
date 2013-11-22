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
public abstract class Mamalia {
    String name;
    private  String species;
    private  boolean isCaveMan;
    private  boolean isExtinct;
    private  boolean hasBigBrain;
    private  boolean isWarmBlooded;
    private  boolean hasHair;
    private  boolean hasLiveBirth;
    

    public Mamalia() {
    }

    public Mamalia(String name, String species, boolean isCaveMan, boolean isExtinct, boolean hasBigBrain, boolean isWarmBlooded, boolean hasHair, boolean hasLiveBirth) {
        this.name = name;
        this.species = species;
        this.isCaveMan = isCaveMan;
        this.isExtinct = isExtinct;
        this.hasBigBrain = hasBigBrain;
        this.isWarmBlooded = isWarmBlooded;
        this.hasHair = hasHair;
        this.hasLiveBirth = hasLiveBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isIsCaveMan() {
        return isCaveMan;
    }

    public void setIsCaveMan(boolean isCaveMan) {
        this.isCaveMan = isCaveMan;
    }

    public boolean isIsExtinct() {
        return isExtinct;
    }

    public void setIsExtinct(boolean isExtinct) {
        this.isExtinct = isExtinct;
    }

    public boolean isHasBigBrain() {
        return hasBigBrain;
    }

    public void setHasBigBrain(boolean hasBigBrain) {
        this.hasBigBrain = hasBigBrain;
    }

    public boolean isIsWarmBlooded() {
        return isWarmBlooded;
    }

    public void setIsWarmBlooded(boolean isWarmBlooded) {
        this.isWarmBlooded = isWarmBlooded;
    }

    public boolean isHasHair() {
        return hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public boolean isHasLiveBirth() {
        return hasLiveBirth;
    }

    public void setHasLiveBirth(boolean hasLiveBirth) {
        this.hasLiveBirth = hasLiveBirth;
    }
    
    
    public abstract void output();  

    @Override
    public String toString() {
        return "Mamalia{" + "Name = " + name + ", \nSpecies = " + species + ", \nCave Man = " + isCaveMan + ", \nExtinct = "
                + isExtinct + ", \nBig Brain = " + hasBigBrain + ", \nWarm Blooded = " + isWarmBlooded +
                ", \nHair = " + hasHair + ", \nLive Birth = " + hasLiveBirth + "\n\n" + '}';
    }
    
    
    
    

    
    
}
