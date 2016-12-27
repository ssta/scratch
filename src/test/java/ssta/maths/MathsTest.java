package ssta.maths;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ssta on 12/27/16.
 */
public class MathsTest {

  @Test
  public void testMapRange() throws Exception {
    assertEquals(9.0, Maths.mapRange(1.0, 0.0, 10.0, 10.0, 0.0), 0.0001);
  }

  @Test
  public void testMapRange1() throws Exception {
    assertEquals(9, Maths.mapRange(1, 0, 10, 10, 0));
  }
}