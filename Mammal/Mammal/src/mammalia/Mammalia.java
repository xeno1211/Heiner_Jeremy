/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mammalia;

import java.util.Objects;

/**
 *
 * @author Xenocyde
 */
public class Mammalia {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        HomoSapienNeanderthalensis fred = new HomoSapienNeanderthalensis("Fred Flintstone", "Homo Sapien Neanderthalensis", true, true, false, true, true, true);
        HomoSapienSapien jeremy = new HomoSapienSapien("Jeremy Heiner", "Homo Sapien Sapien", false, false, true, true, true, true);
        
    }
    
    private static String name;
    private static String species;
    private static boolean isCaveMan;
    private static boolean isExtinct;
    private static boolean hasBigBrain;
    private static boolean isWarmBlooded;
    private static boolean hasHair;
    private static boolean hasLiveBirth;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Mammalia.name = name;
    }

    public static boolean isIsCaveMan() {
        return isCaveMan;
    }

    public static void setIsCaveMan(boolean isCaveMan) {
        Mammalia.isCaveMan = isCaveMan;
    }

    public static boolean isIsExtinct() {
        return isExtinct;
    }

    public static void setIsExtinct(boolean isExtinct) {
        Mammalia.isExtinct = isExtinct;
    }

    public static boolean isHasBigBrain() {
        return hasBigBrain;
    }

    public static void setHasBigBrain(boolean hasBigBrain) {
        Mammalia.hasBigBrain = hasBigBrain;
    }

    public static boolean isIsWarmBlooded() {
        return isWarmBlooded;
    }

    public static void setIsWarmBlooded(boolean isWarmBlooded) {
        Mammalia.isWarmBlooded = isWarmBlooded;
    }

    public static boolean isHasHair() {
        return hasHair;
    }

    public static void setHasHair(boolean hasHair) {
        Mammalia.hasHair = hasHair;
    }

    public static boolean isHasLiveBirth() {
        return hasLiveBirth;
    }

    public static void setHasLiveBirth(boolean hasLiveBirth) {
        Mammalia.hasLiveBirth = hasLiveBirth;
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Mammalia.species = species;
    }
    

    public Mammalia() {
    }

    
    

   

    public static void output(){
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Is a cave man: " + isCaveMan);
        System.out.println("Is extinct: " + isExtinct);
        System.out.println("Has a big brain: " + hasBigBrain);
        System.out.println("Is warm blooded: " + isWarmBlooded);
        System.out.println("Has hair: " + hasHair);
        System.out.println("Has live birth: " + hasLiveBirth);
        System.out.println();
        System.out.println();
        
        
    }
    
    
    
    
    
    
}
