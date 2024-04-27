// Pathsクラスのget()メソッド利用例
import java.nio.file.Paths;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("data.txt");
        Path path2 = Paths.get("E:\\study\\Java\\JavaGoldSampleCode\\server\\src\\Chapter9\\13\\data.txt");
        Path path3 = Paths.get("E:", "study", "Java", "JavaGoldSampleCode", "server", "src", "Chapter9", "13", "data.txt");
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
    }
}