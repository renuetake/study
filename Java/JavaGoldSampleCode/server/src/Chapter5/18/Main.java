// コンストラクタ参照2

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Function<Integer, String[]> obj1 = size -> new String[size];
        Function<Integer, String[]> obj1 = String[]::new;
        System.out.println(obj1.apply(5).length);
    }
}