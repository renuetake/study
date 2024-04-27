// subpath()メソッドの利用

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("/usr/src/Chapter9/16/data.txt");
        System.out.format("1-4\t%s%n", path.subpath(1, 4));
        System.out.format("0-2\t%s%n", path.subpath(0, 2));
        // System.out.format("0-5\t%s%n", path.subpath(0, 5));
        // System.out.format("2-2\t%s%n", path.subpath(2, 2));
    }
}