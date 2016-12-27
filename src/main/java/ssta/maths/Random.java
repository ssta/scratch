package ssta.maths;

/**
 * Created by ssta on 12/12/16.
 */
public class Random {
  static final java.util.Random random = new java.util.Random();

  public static float floatBetween(float low, float high) {
    return (random.nextFloat() * (high - low)) + low;
  }

  public static double doubleBetween(double low, double high) {
    return (random.nextDouble() * (high - low)) + low;
  }
}
