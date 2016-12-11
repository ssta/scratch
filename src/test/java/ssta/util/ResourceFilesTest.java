package ssta.util;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class ResourceFilesTest {

  @Test
  public void testReadLinesToList() throws Exception {
    List<String> strings = ResourceFiles.readLinesToList("ssta/words/usrsharedictwords");
    assertNotNull(strings);
  }


  @Test(expected = NullPointerException.class)
  public void testNotExist() throws Exception {
    ResourceFiles.readLinesToList("ssta/words/doesnotexist");
  }
}