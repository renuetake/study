// HashSetクラスを使用した例2
import java.util.*;
class Foo {
    private String str;
    public Foo(String str) { this.str = str; }
    public String toString() { return str + " "; }
    public int hashCode(){ return str.hashCode(); }
    public boolean equals(Object obj){
        return this.hashCode() == obj.hashCode();
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Foo> set = new HashSet<>();
        Foo f1 = new Foo("BBB"); set.add(f1);
        Foo f2 = new Foo("AAA"); set.add(f2);
        Foo f3 = new Foo("CCC"); set.add(f3);
        Foo f4 = new Foo("AAA"); set.add(f4);
        System.out.println("size : " + set.size());
        for (Foo f : set) { System.out.print(f); }
    }
}