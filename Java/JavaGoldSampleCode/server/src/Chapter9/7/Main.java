// ObjectInputStreamクラスとObjecttOutputStreamクラスの使用例

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Employee writeEmp = new Employee(100, "tanaka");
        try (
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"))
        ){
            oos.writeObject(writeEmp); // 書き出し
            Employee readEmp = (Employee)ois.readObject(); // 読み込み
            System.out.println("ID : " + readEmp.getId());
            System.out.println("Name : " + readEmp.getName());
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}