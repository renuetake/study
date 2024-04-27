// ラムダ式での実装
public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() { // 匿名クラスを利用した場合
            public void run(){
                System.out.println("Hello");
            }
        }).start();


        new Thread(() -> { // ラムダ式で実装した場合
            System.out.println("Hello");
        }).start();
    }
}