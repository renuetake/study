// Filesクラスの使用例

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path p1 = Paths.get("data.txt");
        Path p2 = Paths.get("/usr/src/Chapter9/20/data.txt");
        System.out.format("exists\t\t%s%n", Files.exists(p1));
        try {
            System.out.format("isSameFile\t%s%n", Files.isSameFile(p1, p2));
        } catch (java.io.IOException e) { }
        System.out.format("isDirectory\t%s%n", Files.isDirectory(p1));
        System.out.format("isRegularFile\t%s%n", Files.isRegularFile(p1));
        System.out.format("isReadable\t%s%n", Files.isReadable(p1));
        System.out.format("isExecutable\t%s%n", Files.isExecutable(p1));

    }
}