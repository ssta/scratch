package ssta.util;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Utility methods for doing stuff with resource files.
 * <p>
 * Created by ssta on 12/10/16.
 */
public class ResourceFiles {
  /**
   * Read a resource line by line and return it as a list of lines.
   */
  public static List<String> readLinesToList(String name) {
    Scanner sc = new Scanner(ResourceFiles.class.getClassLoader().getResourceAsStream(name));
    List<String> list = new ArrayList<>();
    while (sc.hasNextLine()) {
      list.add(sc.nextLine());
    }
    return ImmutableList.copyOf(list);
  }
}
