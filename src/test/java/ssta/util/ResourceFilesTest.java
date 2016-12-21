package ssta.util;

import static org.junit.Assert.*;
import org.junit.Test;
import ssta.maths.Sqrt;

import java.util.List;

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

  @Test
  public void dummy() {
    // exercise the auto-generated default no-args constructor to shut the test coverage suite up!
    ResourceFiles r = new ResourceFiles();
  }
}