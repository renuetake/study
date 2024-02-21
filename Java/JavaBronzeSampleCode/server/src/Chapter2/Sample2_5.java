package Chapter2;

public class Sample2_5 {
    public static void main(String[] args) {
        char[] c;                                   // 配列の宣言
        c = new char[3];                            // 配列の作成
        int[] i = new int[3];                       // 配列の宣言と作成
        String str[] = {"Welcome", "to", "Java."};  // 配列の宣言と初期化
        c[0] = 'A'; c[1] = 'B'; c[2] = 'C';         // 各要素へ値の代入
        i[0] = 100; i[1] = 200; i[2] = 300;         // 各要素へ値の代入
        System.out.println("str[] のサイズ  : " + str.length);
        System.out.println("c[0] : " + c[0]);
        System.out.println("i[1] : " + i[1]);
        System.out.println(c);
        System.out.println(i);
        System.out.println(str);
    }
}
