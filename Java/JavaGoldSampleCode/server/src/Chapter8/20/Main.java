// パラレルストリームの生成

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bb", "c");
        Stream<String> stream1 = list.parallelStream();
        System.out.println("stream1 : " + stream1.isParallel());

        Stream<String> stream2 = list.stream();
        System.out.println("stream2 : " + stream2.isParallel());

        Stream<String> stream3 = stream2.parallel();
        System.out.println("stream3 : " + stream3.isParallel());
    }
}