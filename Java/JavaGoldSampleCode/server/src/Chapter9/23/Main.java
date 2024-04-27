// readAllLines()メソッドの利用

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Path path = Paths.get("data.txt");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines){
            System.out.println(line);
        }
    }
}