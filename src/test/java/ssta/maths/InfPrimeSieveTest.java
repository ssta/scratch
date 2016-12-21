package ssta.maths;

import junit.framework.TestCase;

/**
 * ssta.maths.InfPrimeSieveTest, created on 021 21/12/16 14:37 <p>
 * @author StephenSt
 */
public class InfPrimeSieveTest extends TestCase {

  public void test1() throws Exception {
    int n = 1000;
    InfPrimeSieve sieve = new InfPrimeSieve();
    int count = 0;
    while (sieve.next() <= n) { count++; }
    assertEquals(168, count);
  }

  public void test2() throws Exception {
    int n = 1000000;
    InfPrimeSieve sieve = new InfPrimeSieve();
    int count = 0;
    while (sieve.next() <= n) { count++; }
    assertEquals(78498, count);
  }

  public void testHasNext() throws Exception {
    InfPrimeSieve sieve = new InfPrimeSieve();
    assertTrue(sieve.hasNext());
  }

}