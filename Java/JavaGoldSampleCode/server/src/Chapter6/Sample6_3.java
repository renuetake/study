package Chapter6;
class Test {
    void myPrint() { System.out.println("myPrint()"); }
    void myPrint(int a) { System.out.println("myprint(int a)"); }
    void myPrint(int a, int b) {
        System.out.println("myPrint(int a, int b)");
    }
    void myPrint(String s) {
        System.out.println("myPrint(String s)");
    }
}
public class Sample6_3 {
    public static void main(String[] args) {
        // Testクラスのインスタンス化
        Test t = new Test();
        t.myPrint();                // 3行目が呼ばれる
        t.myPrint(100);           // 4行目が呼ばれる
        t.myPrint(100, 200);    // 5行目が呼ばれる
        t.myPrint("yamamoto");    // 6行目が呼ばれる
    }
}
