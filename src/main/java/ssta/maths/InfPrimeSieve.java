/*
 * Copyright (c) 2001-2016 HPD Software Ltd.
 */
package ssta.maths;

import java.util.HashMap;
import java.util.Iterator;

/** "Infinite" (well, as long as it fits in a long) prime sieve Iterator.
 * ssta.maths.SoE, created on 021 21/12/16 14:24 <p>
 * @author StephenSt
 */
public class InfPrimeSieve implements Iterator<Long> {
  long candidate = 2;
  Iterator<Long> basePrimes = null;
  long basePrime = 3;
  long basePrimeSquare = 9;
  // map of the "next" non-primes we haven't yet gotten as far as.
  final HashMap<Long, Long> nonPrimes = new HashMap<>();

  /** "Infinite" iterator always has a next */
  @Override
  public boolean hasNext() {
    return true;
  }


  @Override
  public Long next() {
    if (this.candidate <= 5) {
      if (this.candidate++ == 2) {return 2L;}
      this.candidate++;
      if (this.candidate == 5L) { return 3L;}
      this.basePrimes = new InfPrimeSieve();
      // throw away the first couple of values (they're handled above)
      this.basePrimes.next();
      this.basePrimes.next();
      return 5L;
    }
    for (; this.candidate >= this.basePrimeSquare || nonPrimes.containsKey(this.candidate); candidate += 2) {
      if (candidate >= basePrimeSquare) {
        long adv = this.basePrime << 1;
        nonPrimes.put(this.basePrime * this.basePrime + adv, adv);
        this.basePrime = this.basePrimes.next();
        this.basePrimeSquare = this.basePrime * this.basePrime;
      } else {
        long adv = nonPrimes.remove(this.candidate);
        long nxt = this.candidate + adv;
        while (this.nonPrimes.containsKey(nxt)) {nxt += adv;}
        this.nonPrimes.put(nxt, adv);
      }
    }
    long tmp = candidate;
    candidate += 2;
    return tmp;
  }
}
