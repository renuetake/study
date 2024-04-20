// staticメソッド参照の例2

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // ラムダ式
        //Comparator<Integer> comp = (x, y) -> Integer.compare(x, y);
        // staticメソッド参照
        Comparator<Integer> comp = Integer::compare;
        System.out.println(comp.compare(1, 2));
        System.out.println(comp.compare(2, 1));
    }
}