 package collection;

import java.util.List;
import java.util.stream.Collectors;

class CollectionTest {

  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    return input.stream()
            .map(x -> Math.pow((x * 2) + 3, 5))
            .collect(Collectors.toList());
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    return input.stream()
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
            .map(s -> s + s)
            .collect(Collectors.toList());
  }
}
