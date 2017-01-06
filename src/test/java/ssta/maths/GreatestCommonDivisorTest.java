package ssta.maths;

import junit.framework.TestCase;

import java.math.BigInteger;

/**
 * ssta.maths.GreatestCommonDivisorTest, created on 021 21/12/16 14:59 <p>
 * @author StephenSt
 */
public class GreatestCommonDivisorTest extends TestCase {

  public void testFind() throws Exception {
    assertEquals(BigInteger.valueOf(1), GreatestCommonDivisor.find(BigInteger.valueOf(17), BigInteger.valueOf(5)));
    assertEquals(BigInteger.valueOf(5), GreatestCommonDivisor.find(BigInteger.valueOf(50), BigInteger.valueOf(15)));
    assertEquals(BigInteger.valueOf(123456789), GreatestCommonDivisor.find(BigInteger.valueOf(123456789), BigInteger.valueOf(123456789)));
  }
}