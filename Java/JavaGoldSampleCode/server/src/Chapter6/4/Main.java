// count(), forEach()メソッドのコード例

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        long result1 = Stream.of("a", "b", "c").count();
        System.out.println(result1);
        Stream<String> stream1 = Stream.of("a", "b", "c");
        stream1.forEach(System.out::print);
        System.out.println();
        // StreamインターフェースはIterableを継承していないので、拡張forで取り出せない
        //for(String s : stream1) { Systetm.out.print(s); }
    }
}