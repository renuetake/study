// StreamAPI

import java.util.*;
import java.util.function.*;;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bb", "aa", "cc");

        // 実装例1
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i).toUpperCase();
            list.set(i, str);
        }
        Collections.sort(list);
        for(String str : list){
            System.out.print(str + " ");
        }
        System.out.println();

        list = Arrays.asList("bb", "aa", "cc");
        // 実装例2
        list.stream().sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));
    }
}