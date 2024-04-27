// Runnableインターフェースの使用例
public class Main {
    public static void main(String[] args) {
        // スレッドの作成
        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());

        // スレッドの実行開始
        a.start();
        b.start();
    }
}

// Runnableインターフェースの実装クラス
class ThreadA implements Runnable {
    public void run() { // スレッドが実行する処理
        for(int i = 0; i < 5; i++){
            System.out.print("A: " + i + " ");
        }
    }
}

// Runnableインターフェースの実装クラス
class ThreadB implements Runnable {
    public void run() { // スレッドが実行する処理
        for (int i = 0; i < 5; i++) {
            System.out.print("B: " + i + " ");
        }
    }
}