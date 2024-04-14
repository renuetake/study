// Queueインターフェースを使用した例2
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("1"); queue.offer("2");
        for (String s : queue) { queue.poll(); }
        System.out.println(queue.peek());       // nullが返る
        System.out.println(queue.element());    // 例外がスロー
    }
}