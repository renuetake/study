// ディレクトリの作成と削除

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException{
        Path p1 = Paths.get("ren");
        Files.createDirectory(p1);
        Path p2 = Paths.get("ren/tmp/x/y");
        Files.createDirectories(p2);
        Files.delete(p1);
        Files.deleteIfExists(Paths.get("ren/9_9"));
    }
}