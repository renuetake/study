// 不適切コード

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NGCode {
    public void method(String fileName){
        try {
            // FileInputStreamを使用しているが、クローズ処理が未実装
            FileInputStream fis = new FileInputStream(new File(fileName));
            int data = 0;
            while((data = fis.read()) != -1){
                System.out.print(data + " ");
            }
        } catch (FileNotFoundException e){
            // エラー処理
        } catch (IOException e){
            // エラー処理
        }
    }
}