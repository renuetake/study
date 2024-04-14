// アサーションの使用例
class Test {
    private int check(int point) {
        assert (point > 0) : point + "は不正な値です";
        return point * 100;
    }
    int method(int point) {
        return check(point);
    }
}
public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.method(10));
        System.out.println(obj.method(-1));
    }
}