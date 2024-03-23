package Chapter6;

interface A { }
class B { }
class C extends B { }
class D { }
public class Sample_16 {
    public static void main (String[] args){
        C obj = new C();
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof B);
        System.out.println(obj instanceof C);
        // System.out.println(obj instanceof D); CクラスとDクラスには継承関係がないため、コメントを外すとコンパイルエラー
    }
}