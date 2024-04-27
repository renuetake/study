// CyclicBarrierクラスの利用
import java.util.concurrent.*;
public class Main {
    void exec(CyclicBarrier barrier){
        try {
            System.out.println(Thread.currentThread().getName() + " start ");
            Thread.sleep((int)(Math.random() * 3000));
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " end ");
        } catch (BrokenBarrierException | InterruptedException e){  }
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            CyclicBarrier barrier = new CyclicBarrier(2, () -> System.out.println("task"));
            for (int i = 0; i < 4; i++){
                service.execute(() -> new Main().exec(barrier));
            }
        }finally {
            if (service != null) service.shutdown();
        }
    }
}