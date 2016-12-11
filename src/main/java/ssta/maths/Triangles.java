package ssta.maths;

/**
 * Created by ssta on 12/11/16.
 */
public class Triangles {
  /**
   * Calculate the area of a triangle using Heron's forumla given the three sides
   */
  static double areaFromSides(double a, double b, double c) {
    double s = (a + b + c) / 2;
    double t = s * (s - a) * (s - b) * (s - c);
    return Math.sqrt(t);
  }
}
