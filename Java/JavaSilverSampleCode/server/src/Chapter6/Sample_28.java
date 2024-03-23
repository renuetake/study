package Chapter6;
import java.util.function.Function;

// ラムダ式(省略あり)での実装
public class Sample_28 {
    public static void main(String[] args){
        Function<String, String> obj = str -> "Hello " + str;
        String str = obj.apply("tanaka");
        System.out.println(str);
    }
}