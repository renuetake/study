// 従来型の例

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Integer i1 = 1; int i2 = 2; Integer i3 = i1;
        list.add(i1); list.add(i2); list.add(i3); //list.add("abc");
        System.out.println("size : " + list.size());
        for (int i = 0; i < list.size(); i++){
            //Integer obj = list.get(i);        // NG キャストが必要
            Integer obj = (Integer)list.get(i); // OK
            System.out.print(obj + " ");
        }
    }
}