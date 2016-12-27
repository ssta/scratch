package ssta.words;/* package whatever; // don't place package name! */

import ssta.util.WordListLoader;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramFinder {

  static int countAnagrams(List<String> words) {
    List<Set<String>> anagrams = findAnagrams(words);
    return anagrams.size();
  }

  static int countSowpodsAnagrams() {
    List<String> words = WordListLoader.loadSowpods();
    return countAnagrams(words);
  }

  static int countWordsAnagrams() {
    List<String> words = WordListLoader.loadWordlist();
    return countAnagrams(words);
  }

  public static List<Set<String>> findAnagrams(List<String> words) {
    Map<String, Set<String>> map = new HashMap<>();
    words.forEach(word -> {
      String sortedWord = sortCharsInWord(word);
      if (!map.containsKey(sortedWord)) {
        map.put(sortedWord, new HashSet<>());
      }
      map.get(sortedWord).add(word);
    });
    return map.entrySet().stream()
              .filter(e -> e.getValue().size() > 1)
              .map(Map.Entry::getValue)
              .collect(Collectors.toList());
  }

  static String sortCharsInWord(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}