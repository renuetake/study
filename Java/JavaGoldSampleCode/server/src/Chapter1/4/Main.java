// nullに対するメンバ呼び出し
class Test {
    static String staticValue = "staticValue";  // static変数
    String instanceValue = "instanceValue";     // インスタンス変数
}

public class Main {
    public static void main(String[] args) {
        Test obj = null;
        System.out.println(obj.staticValue);
        System.out.println(obj.instanceValue);
    }    
}
