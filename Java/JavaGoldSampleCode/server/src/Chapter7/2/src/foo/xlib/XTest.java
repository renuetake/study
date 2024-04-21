package xlib;
import ylib.YTest;
public class XTest{
    public static void x(){
        System.out.println("XTest::x");
        YTest.y(); // YTestのy()呼び出し
    }
}