package server.src;
import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String mstr = sc.nextLine();
        String[] m = mstr.split(" ");
        System.out.println(m);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < Integer.parseInt(m[i]); j++){
                if (j == Integer.parseInt(m[i])-1) System.out.print(j+1);
                else System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}