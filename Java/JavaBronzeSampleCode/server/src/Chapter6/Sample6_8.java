package Chapter6;
class Employee {
    private int id; // インスタンス変数にprivateを指定
    public Employee(int i) { id = i; } // コンストラクタにpublicを指定
    public int getId() { return id; } // メソッドにpublicを指定
}

public class Sample6_8 {
    public static void main(String[] args) {
        Employee emp = new Employee(100);
        // private指定されったメンバは、ほかのクラスからアクセス不可
        // System.out.println(
        //     "private 指定のインスタンス変数へアクセス : " + emp.id);
        // )
        // public指定されたメンバは、ほかのクラスからアクセス可能
        System.out.println(
            "public指定のメソッドへアクセス : " + emp.getId()
        );
    }
}
