package Chapter6;
import java.util.ArrayList;

public class Sample_18 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Integer i1  = 10;
        int i2      = 2;
        Integer i3  = i1;

        list.add(i1);
        list.add(i2);   // intデータはBoxingによりIntegerに変換
        list.add(i3);   // 重複要素
        list.add(1, 5); // インデックス1番目に5を追加
        //list.add("abc");// String型を格納しようとしているため、コメントを外すとコンパイルエラー
        System.out.println("size : " + list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (Integer i: list){ System.out.print(i + " "); }
    }
}