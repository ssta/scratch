package ssta.maths;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrianglesTest {

  @Test
  public void testAreaFromSides() throws Exception {
    assertEquals(6, Triangles.areaFromSides(3, 4, 5), 0);
    // not sure if a triangle with zero area is really a legal triangle, but hey...
    assertEquals(0, Triangles.areaFromSides(1, 3, 4), 0);
    assertEquals(43.3, Triangles.areaFromSides(10, 10, 10), 0.02);
    assertEquals(30, Triangles.areaFromSides(5, 12, 13), 0);
  }

  @Test
  public void nonTriangle() {
    assertEquals(Double.NaN, Triangles.areaFromSides(10, 2, 2), 0);
  }
}