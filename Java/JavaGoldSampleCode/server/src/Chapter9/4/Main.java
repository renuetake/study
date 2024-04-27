// FileReaderクラスとFileWriterクラスの使用例

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (
            FileWriter fw = new FileWriter(new File("data.txt"));
            FileReader fr = new FileReader(new File("data.txt"))
        ) {
            fw.write("田中");
            fw.flush();
            int i = 0;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e){ e.printStackTrace(); }
    }
}