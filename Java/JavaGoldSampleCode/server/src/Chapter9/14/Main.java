// FileSystemsクラスとFileSystemクラスの利用

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path path1 = fs.getPath("data.txt");
        Path path2 = fs.getPath("E:\\study\\Java\\JavaGoldSampleCode\\server\\src\\Chapter9\\13");
        Path path3 = fs.getPath("E:","study","Java","JavaGoldSampleCode","server", "src", "Chapter9","13");
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
    }
}