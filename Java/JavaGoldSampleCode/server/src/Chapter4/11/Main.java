// HashMapクラスを使用した例
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "AAA");
        map.put(1, "BBB");
        map.put(2, "AAA");      // 値の重複
        map.put(1, "CCC");      // キーの重複

        System.out.println(map.containsKey(2));         // 引数で指定されたキーに対応するキーと値のペアが存在すればtrue
        System.out.println(map.containsValue("XXX"));   // 引数で指定された値に対応するキーと値のペアが1つ以上存在する場合はtrue
        for (int i = 0; i < map.size(); i++){
            System.out.print(map.get(i) + " ");
        }
    }
}