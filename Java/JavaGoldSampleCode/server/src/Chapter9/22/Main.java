// ファイルとディレクトリのコピーと移動

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Path p1 = Paths.get("data.txt");
        Path p2 = Paths.get("data_cp.txt");
        Path p3 = Paths.get("data_org.txt");
        Path p4 = Paths.get("data_mv.txt");
        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
        Files.move(p3, p4, StandardCopyOption.REPLACE_EXISTING);
        Files.delete(p1);
    }
}