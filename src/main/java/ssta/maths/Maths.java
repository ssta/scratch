package ssta.maths;

/**
 * Created by ssta on 12/27/16.
 */
public class Maths {
  /**
   * Re-maps a number from one range to another.
   * <p>
   * NOTE: Function shamelessly stolen from p5.js
   *
   * @param value  the incoming value to be converted
   * @param start1 lower bound of the value's current range
   * @param stop1  upper bound of the value's current range
   * @param start2 lower bound of the value's target range
   * @param stop2  upper bound of the value's target range
   * @return remapped number
   */
  public static double mapRange(double value, double start1, double stop1, double start2, double stop2) {
    return ((value - start1) / (stop1 - start1)) * (stop2 - start2) + start2;
  }


  /**
   * Re-maps a number from one range to another. Any fractional part of the mapping is rounded to an int.
   * <p>
   * NOTE: Function shamelessly stolen from p5.js
   *
   * @param value  the incoming value to be converted
   * @param start1 lower bound of the value's current range
   * @param stop1  upper bound of the value's current range
   * @param start2 lower bound of the value's target range
   * @param stop2  upper bound of the value's target range
   * @return remapped number
   */
  public static int mapRange(int value, int start1, int stop1, int start2, int stop2) {
    return (int) Math.round(mapRange((double) value, (double) start1, (double) stop1, (double) start2, (double) stop2));
  }
}
