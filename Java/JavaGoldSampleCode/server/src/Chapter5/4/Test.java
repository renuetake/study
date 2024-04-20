// varを使用した例
import java.util.ArrayList;
public class Test {
    //var a = 100;                  // コンパイルエラー
    //static var b = 100;           // コンパイルエラー
    public void method(var data) {  // コンパイルエラー
        var c = "hello";            // OK
        //var d;                    // コンパイルエラー
        //var e = null;             // コンパイルエラー
        final var f = 100;          // OK
        //var final g = 100;        // コンパイルエラー
        var obj = new Foo();        // OK
        var list = new ArrayList<>(); // OK
        for (var i = 0; i < 10; i++) {} // OK
        //var ary1 = {10, 20};      // コンパイルエラー
        var ary2 = new int[] {10, 20}; // OK
    }
}

class Foo {}