// rethrowの利用
class MyExceptionA extends Exception {
    MyExceptionA() { super("MyExceptionA"); }
}
class MyExceptionB extends Exception {
    MyExceptionB() { super("MyExceptionB"); }
}
public class Main {
    public static void main(String[] args) {
        try{
            method();
        } catch (MyExceptionA | MyExceptionB e) {
            System.out.println(e.getMessage());
        }
    }
    public static void method() throws MyExceptionA, MyExceptionB {
        int num = (int)(Math.random() * 10);
        try {
            if (num < 4) {
                throw new MyExceptionA();
            } else {
                throw new MyExceptionB();
            }
        } catch (Exception e) {
            // 例外が起きた際の、method()側で行うべき処理を実装
            // 処理が終わったら、例外をスローする
            throw e;
        }
    }

}