// 1\Main.javaを匿名クラスで実装した例
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        String str = new Function<String, String>() {
            public String apply(String str){
                return "Hello " + str;
            }
        }.apply("naoki");
        System.out.println(str);
    }
}