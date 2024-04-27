// DosFileAttributesインターフェースの使用例

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Path p1 = Paths.get("data.txt");
        DosFileAttributes attr = Files.readAttributes(p1, DosFileAttributes.class);
        System.out.format("isArchive\t%s%n", attr.isArchive());
        System.out.format("isHidden\t%s%n", attr.isHidden());
        System.out.format("isReadOnly\t%s%n", attr.isReadOnly());
        System.out.format("isSystem\t%s%n", attr.isSystem());
    }
}