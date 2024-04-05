package Chapter3;

public class Sample3_10 {
    public static void main(String[] args) {
        int num = 20;
        String str = "numの値は";
        str += num < 10 ? "10未満" : "10以上";
        System.out.println(str);
    }
}
