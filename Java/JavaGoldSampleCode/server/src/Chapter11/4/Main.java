// リソースバンドルを利用するクラス

import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        ResourceBundle obj = ResourceBundle.getBundle("MyResources");
        Long data1 = (Long)obj.getObject("data1");
        Integer data2 = (Integer)obj.getObject("data2");
        int[] data3 = (int[])obj.getObject("data3");
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.print("data3 : ");
        for (int i : data3) { System.out.print(i + " "); }
    }
}