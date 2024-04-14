// asList()メソッドの利用

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"A", "B", "C"};
        List<String> list = Arrays.asList(ary);
        //list.add("D"); // 固定リストなので、要素の追加はNG(UnsupportedOpeartionExceptionが発生)
        list.set(2, "D"); // 要素の変更は可能
        for (String str : list){
            System.out.print(str + " ");
        }
    }
}