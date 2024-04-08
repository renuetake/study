// メソッド内でネストクラスをインスタンス化する
class Outer { //外側のクラス
    private int num = 100;
    class A { // 非staticクラス
        public int num = 200;
        void method(int num) {
            num += 1;
            this.num += 1;
            Outer.this.num += 1;
            System.out.println("num : " + num);
            System.out.println("this.num : " + this.num);
            System.out.println("Outer.this.num : " + Outer.this.num);
        }
    }
}
public class Main { //外部のクラス
    public static void main(String[] args){
        new Outer().new A().method(300);
    }
}