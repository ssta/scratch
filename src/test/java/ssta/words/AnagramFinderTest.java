package ssta.words;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramFinderTest {

  @Test
  public void testCountSowpodsAnagrams() throws Exception {
    assertEquals(21640, AnagramFinder.countSowpodsAnagrams());
  }

  @Test
  public void testCountWordsAnagrams() throws Exception {
    assertEquals(4446, AnagramFinder.countWordsAnagrams());
  }
}