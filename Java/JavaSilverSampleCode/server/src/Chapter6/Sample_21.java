package Chapter6;
import java.util.*;

public class Sample_21 {
    public static void main(String[] args){
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(300); hSet.add(20); hSet.add(500);
        System.out.println("HashSet: " + hSet);

        TreeSet<Integer> tSet = new TreeSet<>();
        tSet.add(300); tSet.add(20); tSet.add(500);
        System.out.println("TreeSet: " + tSet);
    }
}