// 匿名クラスの定義例2
interface MyInter { void methodA(); }
class Outer {
    void method(){
        MyInter obj = new MyInter() {
            public void methodA() {
                System.out.println("methodA()");
            }
        };
        obj.methodA(); // 匿名クラスのメソッド呼び出し
    }
}
public class Main {
    public static void main(String[] args) {
        new Outer().method();
    }
}
