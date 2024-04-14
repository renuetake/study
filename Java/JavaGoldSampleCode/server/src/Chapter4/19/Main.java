// ワイルドカードを使用した例1
class Gen<T> {
    private T var;
    public Gen(T var){ this.var = var; }
    public T getVar(){ return var; }
}

public class Main{
    public static void main(String[] args) {
        int val = Integer.parseInt(args[0]);
        if (val == 1){
            print(new Gen<>(100));
        } else {
            print(new Gen<>("abc"));
        }
    }
    static void print(Gen<?> obj){
        System.out.println(obj.getVar());
    }
}