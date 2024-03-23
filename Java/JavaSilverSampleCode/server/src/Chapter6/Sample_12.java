package Chapter6;

interface MyInter1 {
    double methodA(int num);
    default void methodB(){ System.out.println("methodB()"); }
}

interface MyInter2 {
    int methodC(int val1, int val2);
    static void methodD(){ System.out.println("methodD()"); }
}

class MyClass implements MyInter1, MyInter2 {
    public double methodA(int num) { return num * 0.3; }
    public int methodC(int val1, int val2) { return val1 + val2; }
}

public class Sample_12 {
    public static void main(String[] args){
        MyClass obj = new MyClass();
        System.out.println("methodA()" + obj.methodA(10));
        System.out.println("methodC()" + obj.methodC(10, 20));
        obj.methodB(); // デフォルトメソッドの呼び出し
    }
}