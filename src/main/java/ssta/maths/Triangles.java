package ssta.maths;

import java.util.Arrays;

public class Triangles {
  /**
   * Calculate the area of a triangle using Heron's forumla given the three sides
   */
  static double areaFromSides(double a, double b, double c) {
    double s = (a + b + c) / 2;
    double t = s * (s - a) * (s - b) * (s - c);
    return Math.sqrt(t);
  }

  /**
   * Return true iff the three arguments form a pythagorean triple.
   * A pythagorean triple is a right angled triangle with integral sides.
   */
  public static boolean isPythagoreanTriple(int a, int b, int c) {
    // sort the sides.
    int[] sides = new int[]{a, b, c};
    return isPythagoreanTriple(sides);
  }

  /**
   * Return true iff the three arguments form a pythagorean triple.
   * A pythagorean triple is a right angled triangle with integral sides.
   */
  public static boolean isPythagoreanTriple(int[] sides) {
    assert sides.length == 3;
    // sort the sides.
    Arrays.sort(sides);
    return (sides[0] * sides[0]) + (sides[1] * sides[1]) == (sides[2] * sides[2]);
  }

}
