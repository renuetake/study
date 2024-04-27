// FileInputStreamクラスとFileOutputStreamクラスの使用例

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try{
            fos = new FileOutputStream(new File("data.txt"));
            fos.write(0); fos.write("abc".getBytes()); fos.write(99);
            
            fis = new FileInputStream(new File("data.txt"));
            int data = 0;
            while((data = fis.read()) != -1){
                System.out.print(data + " "); // 読み込んだデータの表示
            }
        } catch (FileNotFoundException e){
            System.out.println("ファイルがありません");
        } catch (IOException e){
            System.out.println("IO Error");
        } finally {
            try { fos.close(); fis.close(); } catch ( IOException e){ }
        }
    }
}