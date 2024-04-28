// keySet()メソッドの利用

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyResources", Locale.US);
        Set<String> keys = bundle.keySet();
        keys.stream()
            .map(k -> bundle.getString(k))
            .forEach(System.out::println);
    }
}