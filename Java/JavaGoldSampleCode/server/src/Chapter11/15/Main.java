// parse()メソッドの利用

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String target = "2021/01/30";
        LocalDate date = LocalDate.parse(target, fmt);
        System.out.println(date);
    }
}