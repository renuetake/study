package Chapter6;
import java.util.*;
import java.util.function.*;

// ラムダ式の活用
public class Sample_29 {
    public static void main(String[] args){
        // removeIfメソッドの利用
        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        data.removeIf((Integer i) -> { return i % 2 != 0; } );
        // data.removeIf(i -> i % 2 != 0);
        System.out.println(data);

        // replaceAllメソッドの利用
        List<String> words = Arrays.asList("Tanaka", "Sato");
        words.replaceAll((String str) -> { return str.toUpperCase(); } );
        // words.replaceAll(str -> str.toUpperCase());
        System.out.println(words);

        // sortメソッドの利用
        List<Integer> list = Arrays.asList(20, 30, 10);
        list.sort((Integer o1, Integer o2) -> { return o2.compareTo(o1); } );
        // list.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(list);

        // forEachメソッドの利用
        List<Integer> lists = Arrays.asList(20, 30, 10);
        lists.forEach((Integer num) -> { System.out.print(num + " "); } );
        //lists.forEach(num -> System.out.println(num + " ") );
    }
}