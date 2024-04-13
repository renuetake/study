import java.util.*;

public class Main {
    public static void main(String[] args) {
        m(new ArrayList<String>());
    }

    // @SafeVarargs
    @SuppressWarning("unchecked")
    static void m(List<String> ...stringLists){
        System.out.println(stringLists);
    }
}