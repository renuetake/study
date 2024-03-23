package Chapter2;

public class Sample_5 {
    public static void main(String[] args){
        // 変数には値を再代入できない
        int num1 = 10;          // 変数
        num1 = 20;              // 変数には再代入可能

        final int num2 = 10;    // 定数
        num2 = 20;              // 定数には再代入できない

    }
}