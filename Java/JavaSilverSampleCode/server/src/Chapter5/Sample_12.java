package Chapter5;

class Test {
    static {
        System.out.println("Test クラス：staticイニシャライザ");
    }
    Test(){
        System.out.println("Test クラス：コンストラクタ");
    }
}

public class Sample_12 {
    static {
        System.out.println("Main クラス：staticイニシャライザ");
    }
    public static void main(String[] args){
        System.out.println("Main クラス：main()メソッド");
        Test obj = new Test();
    }
}