package learnjava.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // System.out.println(date);
        // System.out.println(date.getDayOfYear());

        LocalTime time = LocalTime.MIDNIGHT;
        // System.out.println(time.getMinute());

        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime1 = dateTime.withDayOfMonth(4).withMinute(2);
    }
}