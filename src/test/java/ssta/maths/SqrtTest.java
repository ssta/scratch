package ssta.maths;

import static org.junit.Assert.*;
import org.junit.Test;

public class SqrtTest {

  @Test
  public void testBabylonianSqrt() throws Exception {
    assertEquals(2, Sqrt.babylonianSqrt(4, 0.1), 0.1);
    assertEquals(100, Sqrt.babylonianSqrt(10000, 0.1), 0.1);
    assertEquals(100, Sqrt.babylonianSqrt(10000, 0.001), 0.001);
  }

  @Test
  public void dummy() {
    // exercise the auto-generated default no-args constructor to shut the test coverage suite up!
    Sqrt s = new Sqrt();
  }
}