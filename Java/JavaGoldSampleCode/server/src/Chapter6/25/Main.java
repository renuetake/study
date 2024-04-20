// groupingBy()メソッドのコード例

import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        // 構文2の例1
        Stream<String> stream1 = Stream.of("belle", "akko", "ami", "bob", "nao");
        Map<String, Set<String>> map1 = stream1.collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.toSet()));
        System.out.println(map1);

        // 構文2の例2
        Stream<String> stream2 = Stream.of("belle", "akko", "ami", "bob", "nao");
        Map<String, String> map2 = stream2.collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.joining()));
        System.out.println(map2);
        System.out.println("map2のクラス名: " + map2.getClass());

        // 構文3の例
        Stream<String> stream3 = Stream.of("belle", "akko", "bob", "nao");
        Map<String, String> map3 = stream3.collect(Collectors.groupingBy(
            s -> s.substring(0,1),
            TreeMap::new,
            Collectors.joining()
        ));
        System.out.println(map3);
        System.out.println("map3のクラス名: " + map3.getClass());
    }
}