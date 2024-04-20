// andThen(), compose()メソッドの使用

import java.util.function.Function;

public class Main{
    public static void main(String[] args) {
        Function<String, Character> f1 = s -> s.charAt(0);
        Function<Character, Boolean> f2 = c -> Character.isUpperCase(c);

        // andThenの利用(自身.andThen(after))
        Function<String, Boolean> f3 = f1.andThen(f2);
        System.out.println(f3.apply("Java"));

        // composeの利用(自身.compose(before))
        Function<String, Boolean> f4 = f2.compose(f1);
        //Function<String, Boolean> f4 = f1.compose(f2); // 型が合わなくなる
        System.out.println(f4.apply("Java"));
    }
}