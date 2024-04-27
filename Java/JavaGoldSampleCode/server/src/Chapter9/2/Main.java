// try-with-resources文での例

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try (
            FileOutputStream fos = new FileOutputStream(new File("data.txt"));
            FileInputStream fis = new FileInputStream(new File("data.txt"))
        ) {
            fos.write(0); fos.write("abc".getBytes()); fos.write(99);
            int data = 0;
            while((data = fis.read()) != -1){
                // 読み込んだデータの表示
                System.out.print(data + " ");
            }
        } catch (FileNotFoundException e) {
            System.err.println("ファイルがありません");
        } catch (IOException e){
            System.err.println("IO Error");
        }
    }
}