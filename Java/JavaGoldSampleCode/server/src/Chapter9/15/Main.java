// Pathインターフェースの使用例1

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Windowsの場合
        // Path path = Paths.get("E:\\study\\Java\\JavaGoldSampleCode\\server\\src\\Chapter9\\15\\data.txt");
        // Linuxの場合
        Path path = Paths.get("/usr/src/Chapter9/15/data.txt");
        System.out.format("toString\t:%s%n", path.toString());
        System.out.format("getFileName\t:%s%n", path.getFileName());
        System.out.format("getName(0)\t:%s%n", path.getName(0));
        System.out.format("getNameCount\t:%s%n", path.getNameCount());
        System.out.format("getRoot\t:%s%n", path.getRoot());
        while((path = path.getParent()) != null) {
            System.out.format("\tgetParent: %s%n", path);
        }
        Path p = Paths.get("data.txt");
        System.out.format("getRoot\t:%s%n", p.getRoot());
    }
}