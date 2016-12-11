package ssta.maths;

public class Sqrt {

  /**
   * calculate sqrt using the babylonian method.
   * <p>
   * This involves making a "guess" (we use x = S/2, but it doesn't really matter what you use) and iterating x=(x+(s/x))/2 until we are "close
   * enough".
   */
  public static double babylonianSqrt(double s, double delta) {
    assert s >= 0;
    double x = s / 2;
    double e;
    do {
      x = (x + (s / x)) / 2;
      e = (s - x * x) / (2 * x);
    } while (Math.abs(e) > delta);
    return x;
  }
}
