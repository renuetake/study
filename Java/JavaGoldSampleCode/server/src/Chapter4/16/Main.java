// ジェネリックスを用いたメソッド定義
import java.util.*;
class Gen {
    public <T> T methodA(T value) { return value; }
    public static <T> void methodB(List<T> list){ // メソッドの型パラメータでは、staticメソッドで使用可能
        for (T obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Gen g = new Gen();
        String s1 = g.methodA("ABC");
        String s2 = g.<String>methodA("abc"); // メソッド名の前に明示的に買ったを指定することも可能
        List<String> list = new ArrayList<>();
        list.add(s1); list.add(s2);
        Gen.methodB(list);
        Gen.<String>methodB(list);
    }
}