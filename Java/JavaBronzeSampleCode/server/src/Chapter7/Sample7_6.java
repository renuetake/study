package Chapter7;
class Super {
    public Super() { System.out.println("Super()"); }
    public Super(int a) { System.out.println("Super(int a)"); }
}
class Sub extends Super {
    public Sub() { System.out.println("Sub()"); }
    public Sub(int a) { System.out.println("Sub(int a)"); }
}
public class Sample7_6 {
    public static void main(String[] args) {
        Sub s1 = new Sub();
        Sub s2 = new Sub(10);
    }
}
