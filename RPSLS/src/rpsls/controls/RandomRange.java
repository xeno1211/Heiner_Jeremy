package rpsls.controls;


import java.util.Random;
// Luke Brewer and Jeremy
/** Generate random integers in a certain range. */
public final class RandomRange {
  
  public static final void main (String... aArgs){
    int START = 1;
    int END = 5;
    Random random = new Random();
    showRandomInteger(START, END, random);
  }
  
  private static void showRandomInteger(int aStart, int aEnd, Random aRandom){
    if (aStart > aEnd) {
      throw new IllegalArgumentException("Start cannot exceed End.");
    }
    //get the range, casting to long to avoid overflow problems
    long range = (long)aEnd - (long)aStart + 1;
    // compute a fraction of the range, 0 <= frac < range
    long fraction = (long)(range * aRandom.nextDouble());
    int randomNumber =  (int)(fraction + aStart);    
  }

    @Override
    public String toString() {
        return "RandomRange{" + '}';
    }
  
}
