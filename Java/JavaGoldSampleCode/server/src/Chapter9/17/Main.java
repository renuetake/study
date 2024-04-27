// Pathインターフェースの使用例2

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("./data.txt");
        System.out.format("toString()\t:%s%n", path1.toString());
        System.out.format("normalize()\t:%s%n", path1.normalize());
        System.out.format("toUri()\t:%s%n", path1.toUri());
        System.out.format("isAbsolute()\t:%s%n", path1.isAbsolute());
        System.out.format("toAbsolutePath()\t:%s%n", path1.toAbsolutePath());

        Path path2 = null;
        try {
            path2 = path1.toRealPath();
            System.out.format("toRealPath()\t:%s%n", path2);
        } catch (java.io.IOException e) { e.printStackTrace(); }
    }
}