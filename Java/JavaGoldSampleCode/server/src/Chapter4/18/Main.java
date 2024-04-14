// 継承を使用したジェネリックス
class Gen<T extends Number> {
    private T var;
    public Gen(T var) { this.var = var; }
    public void display() { System.out.println(var); }
}
public class Main {
    public static void main(String[] args) {
        // Integerを扱うGenオブジェクトの生成
        Gen<Integer> g1 = new Gen<>(100);
        g1.display();
        // Doubleを扱うGenオブジェクトの生成
        Gen<Double> g2 = new Gen<>(3.14);
        g2.display();
        //Gen<String> g3 = new Gen<>("abc"); // NG StringはNumberのサブクラスではないため、コンパイルエラー
    }
}