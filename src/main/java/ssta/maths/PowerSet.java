package ssta.maths;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Iterator over the powerset of the input set.<p/>
 * <p>
 * The powerset is the set of all subsets.<p/>
 * <p>
 * The iterator returns the results in binary order.</p>
 * <p>
 * Created by ssta on 12/13/16.
 */
public class PowerSet<T> implements Iterator<Set<T>> {
  List<T> input;
  int size;
  long nextItem;

  public PowerSet(Set<T> inputSet) {
    input = ImmutableList.copyOf(inputSet);
    size = inputSet.size();
    if (size > 60) {
      throw new IllegalArgumentException("Too many elements (max 60)");
    }
    nextItem = 0;
  }

  @Override
  public boolean hasNext() {
    return nextItem < (1 << size);
  }

  @Override
  public Set<T> next() {
    Set<T> set = generateSet(nextItem);
    nextItem++;
    return set;
  }

  private Set<T> generateSet(long nextItem) {
    Set<T> set = new HashSet<>(size);
    for (int i = 0; i < size; i++) {
      if ((nextItem & (1L << i)) > 0) {
        set.add(input.get(i));
      }
    }
    return ImmutableSet.copyOf(set);
  }


}
