package Chapter6;
import java.util.function.Function;

// 匿名クラスを利用した例
public class Sample_26 {
    public static void main(String[] args){
        String str = new Function<String, String>() {
            public String apply (String str) {
                return "Hello " + str;
            }
        }.apply("tanaka");

        System.out.println(str);
    }
}