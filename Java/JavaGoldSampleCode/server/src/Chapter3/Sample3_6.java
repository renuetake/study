package Chapter3;

public class Sample3_6 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        int[] array1 = null;
        int[] array2 = new int[1];
        int num = 0;
        System.out.println(str1 == null);
        System.out.println(str2 == null);
        System.out.println(array1 != null);
        System.out.println(array2 != null);
        // System.out.println(num == null); // コンパイルエラー
    }
}
