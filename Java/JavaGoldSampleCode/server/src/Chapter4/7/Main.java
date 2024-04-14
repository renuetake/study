// Interator インターフェースを使用した例
import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("C"); set.add("A"); set.add("B");
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) { System.out.println(iter.next() + " "); } 
    }
}