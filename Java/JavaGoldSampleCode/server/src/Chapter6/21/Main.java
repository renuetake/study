// toSet(), toMap()メソッド

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //toSet()メソッド
        Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
        Set<String> set = stream1.collect(Collectors.toSet());
        System.out.println(set);

        // toMap()メソッド
        Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
        Map<String, String> map = stream2.collect(Collectors.toMap(s -> s, String::toUpperCase));
        System.out.println(map);
    }
}