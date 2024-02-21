package Chapter2;

public class Sample2_8 {
    public static void main(String[] args) {
        int[] a = new int[1];
        int[] b = a;
        a[0] = 10;
        System.out.println("a[0] : " + a[0] + " b[0] : " + b[0]);
        b[0] = 50;
        System.out.println("a[0] : " + a[0] + " b[0] : " + b[0]);
    }
}
