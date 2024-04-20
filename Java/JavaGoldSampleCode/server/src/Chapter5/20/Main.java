// TtoIntFunctionとIntToDoubleFunctionインターフェースの例

import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        //ToIntFunction<String> f1 = s -> s.legnth();
        ToIntFunction<String> f1 = String::length;
        int ans1 = f1.applyAsInt("Java");
        //Integer ans1 = f1.applyAsInt("Java"); // OK

        //IntToDoubleFunction f2 = i -> i * 1.08;
        IntToDoubleFunction f2 = (int i) -> { return i * 1.08; };
        //IntToDoubleFunction f2 = (Integer i) -> { return i * 1.08; }; // NG. 引数はint型を指定する必要があるが、Integer型を指定している
        double ans2 = f2.applyAsDouble(1000);
    }
}