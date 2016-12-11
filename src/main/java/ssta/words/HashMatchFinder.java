package ssta.words;

import java.util.*;

public class HashMatchFinder {
  /**
   * Allows experimentation with different hashing mechanisms to see which clash more/less
   */
  static int hashWord(String word) {
    return word.hashCode();
  }

  /**
   * Counts the number of hashes built from strings that are arrived at by more than one string
   */
  public long countHashMatches(List<String> strings) {
    Map<Integer, Set<String>> hashes = new HashMap<>();
    strings.stream()
        .forEach(word -> {
          if (!hashes.containsKey(hashWord(word))) {
            hashes.put(hashWord(word), new HashSet<>());
          }
          hashes.get(hashWord(word)).add(word);
        });
    return hashes.values().stream()
        .filter(v -> v.size() > 1)
        .count();

  }
}
