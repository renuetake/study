// HashSetとTreeSetクラスを使用した例

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"CCC", "AAA", "BBB"};
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(ary[0]); hashSet.add(ary[1]); hashSet.add(ary[2]); hashSet.add(ary[0]);

        System.out.println("HashSet size : " + hashSet.size());
        for (String s : hashSet) { System.out.print(s + " ");}
        System.out.println();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(ary[0]); treeSet.add(ary[1]); treeSet.add(ary[2]); treeSet.add(ary[0]);
        System.out.println("TreeSet size : " + treeSet.size());
        for (String s : treeSet) { System.out.print(s + " ");}

    }
}