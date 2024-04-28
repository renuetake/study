// LocalDateクラスの利用

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 2, 10);
        System.out.println("getYear : " + date.getYear());
        System.out.println("getMonth : " + date.getMonth());
        System.out.println("getMonthValue : " + date.getMonthValue());
        System.out.println("getDayOfMonth : " + date.getDayOfMonth());
        System.out.println("getDayOfYear : " + date.getDayOfYear());
        System.out.println("getDayOfWeek : " + date.getDayOfWeek());
    }
}