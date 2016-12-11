package ssta.words;

import org.junit.Test;
import ssta.util.WordListLoader;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HashMatchFinderTest {

  @Test
  public void testCountHashMatches() throws Exception {
    List<String> words = WordListLoader.loadSowpods();
    assertEquals(9, new HashMatchFinder().countHashMatches(words));
  }
}