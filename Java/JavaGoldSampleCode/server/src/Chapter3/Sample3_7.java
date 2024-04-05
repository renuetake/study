package Chapter3;

public class Sample3_7 {
    public static void main(String[] args) {
        int num = 5;
        if (num < 10) {
            System.out.println("numの値は10未満です。");
        }
        num = 20;
        if (num >= 100){
            System.out.println("numの値は100以上です。");
        }
        System.out.println("2つ目のif文の外の処理");
    }
}
