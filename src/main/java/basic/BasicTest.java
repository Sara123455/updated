 package basic;

import io.vavr.control.Option;

public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * also return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    if (n < 0) {
      return Option.none();
    }
    int result = 1;
    for (int j = 0; j < n; j++) {
      result *= i;
      if (result < 0) {
        return Option.none(); // Overflow occurred
      }
    }
    return Option.of(result);
  }
}
