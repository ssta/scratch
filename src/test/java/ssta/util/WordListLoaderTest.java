package ssta.util;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WordListLoaderTest {

  @Test
  public void testLoadWordlist() throws Exception {
    List<String> list1=WordListLoader.loadWordlist();
    List<String> list2=WordListLoader.loadWordlist();
    assertEquals(list1, list2);
  }

  @Test
  public void testLoadSowpods() throws Exception {
    List<String> list1=WordListLoader.loadSowpods();
    List<String> list2=WordListLoader.loadSowpods();
    assertEquals(list1, list2);
  }
}