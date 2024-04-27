// readAttributes()メソッドの使用例

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Path p1 = Paths.get("data.txt");
        BasicFileAttributes attr = Files.readAttributes(p1, BasicFileAttributes.class);
        System.out.format("creationTime\t%s%n", attr.creationTime());
        System.out.format("lastModifiedTime\t%s%n", attr.lastModifiedTime());
        System.out.format("size\t%s%n", attr.size());
    }
}