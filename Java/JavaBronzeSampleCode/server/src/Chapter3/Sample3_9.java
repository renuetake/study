package Chapter3;

public class Sample3_9 {
    public static void main(String[] args) {
        char c = 'p';

        if (c == 'a') {
            System.out.println("cの値はaです。");
        } else if (c == 'b') {
            System.out.println("cの値はbです。");
        } else {
            System.out.println("cの値はaでもbでもありません。");
            System.out.println("cの値は" + c + "です。");
        }
    }
}
