// equals() と hashCode() のオーバーライド
class Foo {
    private int num;
    public boolean equals (Object o){
        if ((o instanceof Foo) && (((Foo)o).num == this.num)){
            return true;
        } else {
            return false;
        }
    }
    public int hashCode() {
        return num * 5;
    }
}
public class Main {
    public static void main(String[] args) {
        Foo f1 = new Foo(); Foo f2 = new Foo();
        System.out.println("f1.equals(f2) : " + (f1.equals(f2)));
    }
}
