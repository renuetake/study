package Chapter8;
public class Sample8_5 {
    public static void main(String[] args) {
        double a = 10.5;
        // int b = a;
        int c = (int)a;
        System.out.println("cの値 : " + c);
        // foo(c);
        foo((short)c);
    }    
    static void foo(short d) {
        System.out.println("dの値 : " + d);
    }
}
