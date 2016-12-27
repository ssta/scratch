package ssta.maths;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import java.util.Date;
import java.util.stream.IntStream;

public class PowerSetTest {
  @Test
  public void thingy() {


    // not really a unit test, but a convenient way to run the damn thing...
    long start = new Date().getTime();
    int[] ints = IntStream.range(0, 20).toArray();
    Integer[] ints2 = new Integer[ints.length];
    for (int i = 0; i < ints.length; i++) {
      ints2[i] = ints[i];
    }

    PowerSet<Integer> ps = new PowerSet<>(ImmutableSet.copyOf(ints2));
    int count = 0;
    while (ps.hasNext()) {
      ps.next();
      count++;
    }
    long end = new Date().getTime();
    System.out.println(count);
    System.out.println((end - start));

  }
}