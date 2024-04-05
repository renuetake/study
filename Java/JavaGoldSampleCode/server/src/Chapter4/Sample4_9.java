package Chapter4;

public class Sample4_9 {
    public static void main(String[] args) {
        for (int i = 0; ; i++){ // 式2 が省略されているので無限ループ
            if (i == 3){
                break; // breakによりfor文から抜ける
            }
            System.out.println("i = " + i);
        }
        System.out.println("for文の後の処理");
    }
}
