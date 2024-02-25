package Chapter8;
interface XIF {
    void methodA();
}

interface YIF {
    void methodB();
}

interface SubIF extends XIF, YIF {
    void methodC();
}
class MyClass implements SubIF {
    public void methodA() { System.out.println("methodA()"); }
    public void methodB() { System.out.println("methodB()"); }
    public void methodC() { System.out.println("methodC()"); }

}
public class Sample8_4 {
    public static void main(String[] args) {
        MyClass c = new MyClass();
        c.methodA(); c.methodB(); c.methodC();
    }
}
