// equals()メソッドを使用した例
class Foo {}

public class Main {
    public static void main(String[] args) {
        Foo f1 = new Foo(); Foo f2 = new Foo();
        System.out.println("f1.equals(f2) : " + (f1.equals(f2)));
        Foo f3 = new Foo(); Foo f4 = f3;
        System.out.println("f3.equals(f4) : " + (f3.equals(f4)));
        System.out.println("f3.equals(null) : " + (f3.equals(null)));
    }    
}
