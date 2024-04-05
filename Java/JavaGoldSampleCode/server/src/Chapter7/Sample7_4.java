package Chapter7;
class Foo {
    String s; int i;
    public Foo() {
        this("Hello");
    }
    public Foo(String s) {
        this(s, 1);
    }
    public Foo(String s, int i) {
        this.s = s; this.i = i;
        System.out.println("String : " + this.s);
        System.out.println("int  : " + this.i);
    }
}
public class Sample7_4 {
    public static void main(String[] args) {
        System.out.println("Foo()の呼び出し----------------");
        Foo f1 = new Foo();
        System.out.println("Foo(\"Hey\")の呼び出し---------");
        Foo f2 = new Foo("Hey");
        System.out.println("Foo(\"Bye\", 200)の呼び出し----");
        Foo f3 = new Foo("Bye", 200);
    }    
}
