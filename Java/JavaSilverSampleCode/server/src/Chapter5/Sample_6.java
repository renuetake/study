package Chapter5;


class Test {
    public void method(String s, int... a){
        System.out.println(s + "サイズ：" + a.length);
        for (int i: a){
            System.out.println(" 第二引数の値：" + i);
        }
    }
}


public class Sample_6 {
    public static void main(String[] args){
        Test obj = new Test();
        int[] ary = {10, 20, 30};

        obj.method("一回目");           obj.method("二回目", 10);
        obj.method("三回目", 10, 20);   obj.method("四回目", ary);
        //obj.method("五回目", null); //可変長引数にnullを渡した場合でもコンパイルは成功するが、6行目でlengthを呼び出しているので、NullPointerException例外が発生する
    }
}