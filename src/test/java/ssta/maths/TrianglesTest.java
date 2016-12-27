package ssta.maths;

import static org.junit.Assert.*;
import org.junit.Test;

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

  @Test
  public void testIsPythagoreanTriple() throws Exception {
    assertTrue(Triangles.isPythagoreanTriple(3, 4, 5));
    assertTrue(Triangles.isPythagoreanTriple(5, 4, 3));
    assertTrue(Triangles.isPythagoreanTriple(12, 13, 5));

    assertFalse(Triangles.isPythagoreanTriple(3, 4, 6));
    assertFalse(Triangles.isPythagoreanTriple(10, 10, 10));
  }

  @Test
  public void testIsPythagoreanTriple1() throws Exception {
    int[] sides = new int[]{3, 4, 5};
    assertTrue(Triangles.isPythagoreanTriple(sides));

    sides = new int[]{5, 4, 3};
    assertTrue(Triangles.isPythagoreanTriple(sides));

    sides = new int[]{12, 13, 5};
    assertTrue(Triangles.isPythagoreanTriple(sides));

    sides = new int[]{3, 4, 6};
    assertFalse(Triangles.isPythagoreanTriple(sides));

    sides = new int[]{10, 10, 10};
    assertFalse(Triangles.isPythagoreanTriple(sides));
  }

  @Test
  public void dummy() {
    // exercise the auto-generated default no-args constructor to shut the test coverage suite up!
    Triangles t = new Triangles();
  }
}