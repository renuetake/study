// 排他制御と同期制御の低用例
public class Main {
    public static void main(String[] args) {
        Share share = new Share();
        ThreadA threadA = new ThreadA(share);
        ThreadB threadB = new ThreadB(share);
        threadA.start(); threadB.start();
    }
}

class Share { // 共有して使用されるオブジェクト
    private int a = 0;
    private String b;
    public synchronized void set() {
        while(a != 0){
            try{
                wait();
            } catch(InterruptedException e){ }
        }
        notify();
        a++; b = "data";
        System.out.println("set() a: " + a + " b: " + b);
    }
    public synchronized void print() {
        while(b == null){
            try{
                wait();
            } catch (InterruptedException e){ }
        }
        notify();
        a--; b = null;
        System.out.println("print() a: " + a + " b: " + b);
    }
}

class ThreadA extends Thread {
    private Share share;
    public ThreadA(Share share){ this.share = share;}
    public void run(){
        for(int i = 0; i < 5; i++){ share.set();}
    }
}

class ThreadB extends Thread {
    private Share share;
    public ThreadB(Share share){ this.share = share; }
    public void run(){
        for(int i = 0; i < 5; i++){ share.print();}
    }
}