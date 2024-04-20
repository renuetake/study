// replaceAll()メソッドの利用1

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Tanaka", "Sato");
        /* // 匿名クラスで実装した場合
        words.replaceAll(new UnaryOperator<String>() {
            public String apply(String str){
                return str.toUppercase();
            }
        }); */
        words.replaceAll( (String str) -> {return str.toUpperCase(); });
        //words.replaceA;;( (var str) -> { return str.toUpperCase(); }); // ラムダ式の引数の型にはvarを指定可能
        System.out.println(words);
    
           
    }
    
}

