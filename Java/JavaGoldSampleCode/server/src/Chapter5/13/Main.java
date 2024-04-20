// インスタンスメソッド参照の例1

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 2);
        //forEachを使用しない
        //for(int a : list){System.out.println(a); }

        //forEachを使用、かつラムダ式を引数に渡す
        //list.forEach(a -> System.out.println(a) );

        // インスタンスメソッド参照
        list.forEach(System.out::println); // OK
        //list.forEach(System.out::print + ", "); // NG

        
    }
}