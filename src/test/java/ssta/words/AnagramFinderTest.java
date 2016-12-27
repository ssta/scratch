package ssta.words;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnagramFinderTest {

  @Test
  public void testCountSowpodsAnagrams() throws Exception {
    assertEquals(21640, AnagramFinder.countSowpodsAnagrams());
  }

  @Test
  public void testCountWordsAnagrams() throws Exception {
    assertEquals(4446, AnagramFinder.countWordsAnagrams());
  }

  @Test
  public void dummy() {
    // exercise the auto-generated default no-args constructor to shut the test coverage suite up!
    AnagramFinder a = new AnagramFinder();
  }
}