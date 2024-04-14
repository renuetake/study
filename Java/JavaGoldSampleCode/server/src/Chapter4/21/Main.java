// HashSetクラスとTreeSetクラスの違い
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashSetは順不同で管理
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(300); hSet.add(20); hSet.add(500);
        System.out.println("HashSet : " + hSet);

        // TreeSetは要素をソート(自然順序付け)して管理
        TreeSet<Integer> tSet1 = new TreeSet<>();
        tSet1.add(300); tSet1.add(20); tSet1.add(500);
        System.out.println("TreeSet1 : " + tSet1);

        TreeSet<String> tSet2 = new TreeSet<>();
        tSet2.add("nao"); tSet2.add("Nao"); tSet2.add("100");
        System.out.println("TreeSet2 : " + tSet2);

        // キーをもとにソートして管理
        TreeMap<String, Integer> tMap = new TreeMap<>();
        tMap.put("2", 300); tMap.put("3", 20); tMap.put("1", 500);
        System.out.println("TreeMap : " + tMap);
    }
}