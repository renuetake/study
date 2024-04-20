// Functionインターフェースの実装クラス
import java.util.function.*;

class MyFunc implements Function<String, String> {
    public String apply(String str){
        return "Hello " + str;
    }
}

public class Main {
    public static void main(String[] args) {
        MyFunc obj = new MyFunc();
        String str = obj.apply("naoki");
        System.out.println(str);
    }
}