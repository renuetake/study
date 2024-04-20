// toMap()メソッドのコード例2

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("nao", "akko", "ami");
        Map<Integer, String> map1 = stream1.collect(Collectors.toMap(
            String::length, // キーの指定
            s -> s,         // valueの指定
            (s1, s2) -> s1 + ":" + s2)); // キーが重複していた時の処理
        System.out.println(map1);
        System.out.println(map1.getClass());

        Stream<String> stream2 = Stream.of("nao", "akko", "ami");
        Map<Integer, String> map2 = stream2.collect(Collectors.toMap(
            String::length,
            s -> s,
            (s1, s2) -> s1 + ":" + s2,
            TreeMap::new)); // マージした結果を格納するMapとしてTreeMapのインスタンス化処理を記載
        System.out.println(map2);
        System.out.println(map2.getClass());
    }
}