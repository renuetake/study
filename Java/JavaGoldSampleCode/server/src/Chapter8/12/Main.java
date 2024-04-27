// newSingleThreadExecutor()の使用

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            System.out.println("service.execute()");
            for (int i = 0; i < 3; i++){
                service.execute(() -> {
                    System.out.print("thread task");
                    for(int a = 0; a < 5; a++){
                        try {
                            Thread.sleep(1000);
                            System.out.print(" * ");
                        } catch (InterruptedException e){ e.printStackTrace(); }
                    }
                    System.out.println();
                });
            }
        } finally {
            service.shutdown(); // ExecutorServiceの終了
            System.out.println("ex.shutdown()");
        }
    }
}