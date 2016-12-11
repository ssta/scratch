package ssta.maths;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTest {

  @Test
  public void testBabylonianSqrt() throws Exception {
    assertEquals(2, Sqrt.babylonianSqrt(4, 0.1), 0.1);
    assertEquals(100, Sqrt.babylonianSqrt(10000, 0.1), 0.1);
    assertEquals(100, Sqrt.babylonianSqrt(10000, 0.001), 0.001);
  }

  @Test(expected = AssertionError.class)
  public void testBabylonianSqrt1() throws Exception {
    assertEquals(2, Sqrt.babylonianSqrt(-1, 0.1), 0.1);
  }
}