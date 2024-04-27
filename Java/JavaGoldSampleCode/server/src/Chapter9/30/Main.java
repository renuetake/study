// list()メソッドの利用

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("ren/9_XX");
        try {
            Files.list(path).forEach(System.out::println);
            System.out.println("-----------------");
            Files.list(path)
                .filter(s -> !Files.isDirectory(s))
                .forEach(System.out::println);
        } catch (IOException e){ e.printStackTrace();}
    }
}