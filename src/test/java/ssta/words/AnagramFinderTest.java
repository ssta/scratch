package ssta.words;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ssta on 12/10/16.
 */
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