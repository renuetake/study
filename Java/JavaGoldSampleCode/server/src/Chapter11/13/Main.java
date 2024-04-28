// DateTimeFormatterクラスの利用

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 2, 1);
        DateTimeFormatter fmt1 = DateTimeFormatter.ISO_DATE;
        System.out.println("date : " + date);
        System.out.println("fmt1#format() : " + fmt1.format(date));
        System.out.println("date#format() : " + date.format(fmt1));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("FormatStyle#JP : " + fmt2.format(date));

        DateTimeFormatter fmt3 = fmt2.localizedBy(Locale.US);
        System.out.println("FormatStyle#US : " + fmt3.format(date));
    }
}