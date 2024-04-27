// Threadクラスの使用例
public class Main {
    public static void main(String[] args) {
        // スレッドの作成
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        // スレッドの実行開始
        a.start();
        b.start();
    }
}

class ThreadA extends Thread { // スレッドクラス
    public void run() { // スレッドが実行する処理
        for(int i = 0; i < 5; i++){
            System.out.print("A:" + i + " ");
        }
    }
}

class ThreadB extends Thread { // スレッドクラス
    public void run() { // スレッドが実行する処理
        for(int i = 0; i < 5; i++) { 
            System.out.print("B:" + i + " ");
        }
    }
}