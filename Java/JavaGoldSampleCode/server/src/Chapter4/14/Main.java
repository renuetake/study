// ダイヤモンド演算子
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "A");
        List<String> list1 = new ArrayList<>();
        list1.add("B");
        methodA(new ArrayList<>());
        List<String> list2 = methodB();
    }
    //static void methodA(List<> list){ // NG
    static void methodA(List<String> list){ // OK
        System.out.println("methodA()");
        list.add("B");
    }
    //static ArrayList<> methodB() { // NG
    static ArrayList<String> methodB() { // OK
        System.out.println("methodB()");
        return new ArrayList<>();
    }
}