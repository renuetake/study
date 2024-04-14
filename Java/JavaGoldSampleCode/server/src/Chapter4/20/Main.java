// ワイルドカードを使用した例2
import java.util.*;
class X {
    public String toString() { return "X"; }
}

class Y extends X {
    public String toString() { return "Y"; }
}

public class Main {
    // 引数で受け取るリストの要素はXクラスまたはそのサブクラス
    public static void method1(List<? extends X> list){
        //list.add(new X());    // ワイルドカードを使用している場合、実行時まで引数で受け取るオブジェクトの型がわからないため、
        //list.add(new Y());    // add()メソッドにより何かしらのオブジェクトを格納するようなコードを記述するとコンパイルエラー
        System.out.print(list.get(0) + " ");
    }

    // 引数で受け取るリストの要素はYクラスまたはそのスーパークラス
    public static void method2(List<? super Y> list){
        //list.add(new X());    // method1のaddと同理由 
        list.add(new Y());      // タイプと同じ型のオブジェクトであれば要素の追加は可能
        System.out.print(list.get(0) + " ");
    }

    public static void main(String[] args) {
        List<X> l1 = new ArrayList<>(); l1.add(new X());
        List<Y> l2 = new ArrayList<>(); l2.add(new Y());
        method1(l1);    // Xオブジェクトを格納したリストを渡す
        method1(l2);    // Yオブジェクトを格納したリストを渡す
        method2(l1);    // Xオブジェクトを格納したリストを渡す
        method2(l2);    // Yオブジェクトを格納したリストを渡す

    }
}