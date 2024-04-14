// Queueインターフェースを使用した例1
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("1"); queue.add("2"); queue.add("3");
        System.out.println(queue);
        System.out.println("element() : " + queue.element());
        System.out.println(queue);
        System.out.println("remove() : " + queue.remove());
        System.out.println(queue);
    }
}