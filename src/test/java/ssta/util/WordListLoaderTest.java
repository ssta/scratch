package ssta.util;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

public class WordListLoaderTest {

  @Test
  public void testLoadWordlist() throws Exception {
    List<String> list1 = WordListLoader.loadWordlist();
    List<String> list2 = WordListLoader.loadWordlist();
    assertEquals(list1, list2);
  }

  @Test
  public void testLoadSowpods() throws Exception {
    List<String> list1 = WordListLoader.loadSowpods();
    List<String> list2 = WordListLoader.loadSowpods();
    assertEquals(list1, list2);
  }

  @Test
  public void dummy() {
    // exercise the auto-generated default no-args constructor to shut the test coverage suite up!
    WordListLoader w = new WordListLoader();
  }
}