// replaceAll()メソッドの利用2

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Tanaka", "Sato");
        words.replaceAll(str -> str.toUpperCase() );
        System.out.println(words);
    }
}