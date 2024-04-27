// getAttribute()メソッドの使用例

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Path path = Paths.get("data.txt");
        Object obj1 = Files.getAttribute(path, "creationTime");
        Object obj2 = Files.getAttribute(path, "lastModifiedTime");
        Object obj3 = Files.getAttribute(path, "size");
        System.out.format("creationTime\t:%s%n", obj1);
        System.out.format("lastModifiedTime\t:%s%n", obj2);
        System.out.format("size\t:%s%n", obj3);
    }
}