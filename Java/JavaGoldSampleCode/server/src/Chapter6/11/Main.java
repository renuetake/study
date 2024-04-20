// orElse(), orElseGet(), orElseTthrow()メソッドのコード例

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.empty();
        Optional<Double> result = stream.findFirst();
        //System.out.println(result.get());
        System.out.println(result.orElse(0.0));
        System.out.println(result.orElseGet(() -> Math.random()));
        System.out.println(result.orElseThrow(IllegalArgumentException::new));
        //System.out.println(result.orElseThrow(() -> new IllegalArgumentException())); // この書き方でもOK
        //result.orElseGet(IllegalArgumentException::new); // NG. orElseGet()の戻り値は型パラメータに従うため、Double型を返す必要がある
    }
}