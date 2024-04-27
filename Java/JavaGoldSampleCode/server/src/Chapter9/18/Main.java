// resolve()メソッドの利用

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("../../chap9");
        Path path2 = Paths.get("18/X");
        System.out.format("resolve:%s%n", path1.resolve(path2));
        Path path3 = Paths.get("/usr/src");
        System.out.format("resolve:%s%n", path1.resolve(path3));
        Path path = Paths.get("/usr/src/Chapter9");
        Iterator<Path> iter = path.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}