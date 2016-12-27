/*
 * Copyright (c) 2001-2016 HPD Software Ltd.
 */
package ssta.maths;

import java.math.BigInteger;

/** Euclid's algorithm, applied to BigIntegers
 *
 * ssta.maths.GreatestCommonFactor, created on 021 21/12/16 14:53 <p>
 * @author StephenSt
 */
public class GreatestCommonDivisor {
  public static BigInteger find(BigInteger a, BigInteger b) {
    while (a.compareTo(b) != 0) {
      if (a.compareTo(b) > 0) {
        a = a.subtract(b);
      } else {
        b = b.subtract(a);
      }
    }
    return a;
  }

}
