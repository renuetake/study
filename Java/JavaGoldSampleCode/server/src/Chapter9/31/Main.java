// find()メソッドの利用

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path p = Paths.get("ren");
        long dateF = 1596790800000L;
        try{
            Files.find(p, 10, (path, attr) -> path.toString().endsWith(".jpg") && attr.creationTime().toMillis() > dateF)
                .forEach(System.out::println);
        } catch (IOException e) {e.printStackTrace();}
    }
}