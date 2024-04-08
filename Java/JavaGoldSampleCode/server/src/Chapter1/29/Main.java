// 匿名クラスの定義例1
interface MyInter { void methodA(); }
class Outer {
    void method() {
        new MyInter() {
            public void methodA() {
                System.out.println("methodA()");
            }
        }.methodA(); // 匿名クラスのメソッド呼び出し
    }
}
public class Main {
    public static void main(String[] args) {
        new Outer().method();
    }
}