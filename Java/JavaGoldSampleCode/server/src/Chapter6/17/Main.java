// peek()メソッドのコード例

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Stream.of("one", "three", "two", "three", "four")
                                  .filter(s -> s.length() > 3)
                                  .peek(e -> System.out.println("After the filter : " + e))
                                  .distinct()
                                  .peek(e -> System.out.println("After the distinct : " + e))
                                  .map(String::toUpperCase)
                                  .peek(e -> System.out.println("After the map : " + e))
                                  .collect(Collectors.toList());

    }
}