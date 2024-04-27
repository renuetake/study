// BufferedReaderクラスの使用例
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new FileReader("data.txt"))
        ) {
            System.out.println(br.readLine());
            br.mark(256);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            br.reset();
            System.out.println(br.readLine());
            br.skip(2);
            System.out.println(br.readLine());
        } catch (IOException e) { e.printStackTrace(); }
    }    
}