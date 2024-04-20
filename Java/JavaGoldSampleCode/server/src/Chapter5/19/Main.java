// IntFunctionインターフェースの例

import java.util.IntSummaryStatistics;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {
        //IntFunction<String[]> f1 = size -> new String[size];
        IntFunction<String[]> f1 = String[]::new;
        String[] ans1 = f1.apply(5);

        //IntFunction f2 = i -> Math.random() * i; // NG
        IntFunction<Double> f2 = i -> Math.random() * i;
        Double ans2 = f2.apply(10);

        IntSupplier f3 = "Java"::length;
        int ans3 = f3.getAsInt();
    }
}