// toArray()メソッドのコード例

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        int[] ary1 = IntStream.range(1, 10).toArray(); // rangeは終了値を含まない
        int[] ary2 = IntStream.rangeClosed(1, 10).toArray();    // rangeClosedは終了値を含む
        Object[] ary3 = Stream.of("a", "b").toArray();
        String[] ary4 = Stream.of("a", "b").toArray(String[]::new);
        System.out.println("ary1 : " + Arrays.toString(ary1));
        System.out.println("ary2 : " + Arrays.toString(ary2));
        System.out.println("ary3 : " + ary3.getClass());
        System.out.println("ary4 : " + ary4.getClass());
    }
}