package Chapter6;
class Test {
    int instanceVal = 100;
    static int staticVal = 200;
    void methodA() { System.out.println("methodA(); " + instanceVal);}
    static void methodB () {
        System.out.println("methodB(): " + staticVal);
    }
}
public class Sample6_6 {
    public static void main(String[] args) {
        // System.out.println(Test.instanceVal);    // 1. NG
        System.out.println(Test.staticVal);         // 2. OK
        // Test.methodA();                          // 3. NG
        Test.methodB();                             // 4. OK
        System.out.println("-----------------------------");
        Test t = new Test();
        System.out.println(t.instanceVal);          // 5. OK
        System.out.println(t.staticVal);            // 6. OK
        t.methodA();                                // 7. OK
        t.methodB();                                // 8. OK
    }
}
