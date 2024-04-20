// toList(), joining(), summingInt(), averagingInt()メソッドのコード例

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // toList()メソッド
        Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
        List<String> result1 = stream1.collect(Collectors.toList());
        System.out.println(result1);

        // joining()メソッド
        Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
        String result2 = stream2.collect(Collectors.joining(" | "));
        System.out.println(result2);

        // summingInt()メソッド
        Stream<String> stream3 = Stream.of("naoki", "akko", "ami");
        Integer result3 = stream3.collect(Collectors.summingInt(t -> t.length()));
        System.out.println(result3);

        // averagingInt()メソッド
        Stream<String> stream4 = Stream.of("naoki", "akko", "ami");
        Double result4 = stream4.collect(Collectors.averagingInt(t -> t.length()));
        System.out.println(result4);
    }
}