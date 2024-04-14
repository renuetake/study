//try-catch-finallyの利用例
public class Main {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int[] ary = {10, 20, 30};
        try {
            for (int i = 0; i < num; i++){
                System.out.println("ary : " + ary[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("例外が発生しました");
        } finally {
            System.out.println("finallyの実行");
        }
        System.out.println("end");
    }
}