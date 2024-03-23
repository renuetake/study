package Chapter6;
import java.util.function.Function;

// ラムダ式(省略なし)での実装
public class Sample_27 {
    public static void main(String[] args){
        Function<String, String> obj = (String str) -> {
            return "Hello " + str;
        };
        String str = obj.apply("tanaka");
        System.out.println(str);
    }
}