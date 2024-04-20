// ストリーム生成のコード例
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::print);

        String[] ary2 = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(ary2);

        int[] ary3 = {1, 2, 3};
        IntStream stream3 = Arrays.stream(ary3);

        Stream<String> stream4 = Stream.of("abc");

        Stream<Long> stream5 = Stream.of(1L, 2L, 3L);

        Stream<String> stream66 = Stream.empty();

        Stream<String> stream7 = Stream.generate(() -> "Java");

        IntStream stream8 = IntStream.of(1, 2, 3);

        IntStream stream9 = IntStream.iterate(1, n -> n + 1);

        IntStream.iterate(1, n -> n <= 10, n -> n + 1);

        IntStream stream11 = IntStream.range(1, 10);

        IntStream stream12 = IntStream.rangeClosed(1, 10);
    }
}