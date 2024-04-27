// sleep()メソッドとinterrupt()メソッドの使用例
public class Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            System.out.println("threadA: sleep開始");
            try {
                Thread.sleep(5000); // ThreadAスレッドのsleep
            } catch (InterruptedException e){
                System.out.println("threadA: 割り込みをキャッチしました");
            }
            System.out.println("threadA: 処理再開");
        });

        threadA.start();

        try{
            System.out.println("main: sleep開始");
            Thread.sleep(2000); // mainスレッドのsleep
            System.out.println("main: sleep終了");
            threadA.interrupt(); // スレッドへ割り込み
        } catch (InterruptedException e){
            System.out.println("main: 割り込みをキャッチしました");
        }
    }
}