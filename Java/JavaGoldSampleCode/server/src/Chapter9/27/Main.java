// getRootDirectories()とnewDirectoryStream()メソッドの使用例

import java.io.IOError;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Iterable<Path> dirs = fs.getRootDirectories();
        for (Path name : dirs){
            System.out.println("RootDirectories : " + name);
        }
        Path path = Paths.get("ren");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
            for(Path file : stream){
                System.out.println(file.getFileName());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}