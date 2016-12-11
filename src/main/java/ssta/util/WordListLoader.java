package ssta.util;

import java.util.List;

/**
 * Noddy class that statically loads wordlists and returns immutable copies of them
 */
public class WordListLoader {
  static List<String> wordList;
  static List<String> sowpodsList;

  /**
   * Loads the list of words in resource (originally from /usr/share/dict/words) into an immutable {@link java.util.List}.
   *
   * @return the list of words
   */
  public static List<String> loadWordlist() {
    if (wordList == null) {
      wordList = ResourceFiles.readLinesToList("ssta/words/usrsharedictwords");
    }
    return wordList;
  }

  /**
   * Loads the SOWPODS list of words into an immutable {@link java.util.List}.  SOWPODS was from
   * <a href="https://www.wordgamedictionary.com/sowpods/download/sowpods.txt">here</a>
   *
   * @return the list of words
   */
  public static List<String> loadSowpods() {
    if (sowpodsList == null) {
      sowpodsList = ResourceFiles.readLinesToList("ssta/words/sowpods.txt");
    }
    return sowpodsList;
  }
}
