// asDoubleStream()メソッドの使用

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // IntStream → DoubleStream(mapToDouble()を使用)
        IntStream stream1i = IntStream.of(2, 3, 5);
        DoubleStream stream1d = stream1i.mapToDouble(n -> n);
        System.out.println(stream1d.average().getAsDouble());

        // IntStream → DoubleStream(asDoubleStream()を使用)
        IntStream stream2i = IntStream.of(2, 3, 5);
        DoubleStream stream2d = stream2i.asDoubleStream();
        System.out.println(stream2d.average().getAsDouble());
    }
}