// staticメソッド参照の例1

import java.util.*;
import java.util.function.*;;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2);
        /* 匿名クラスを使用した場合
        Consumer<List<Integer>> con1 = new Consumer<List<Integer>() {
            public void accept(List<Integer> list){
                Collections.sort(list);
            }            
        }; */

        /* ラムダ式を使用した場合
        Consumer<List<Integer>> con1 = lambdaList -> Collections.sort(lambdaList); */
        
        // staticメソッド参照
        Consumer<List<Integer>> con1 = Collections::sort;
        con1.accept(list);
        System.out.println(list);
    }
}