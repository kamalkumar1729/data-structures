package learnjava.java8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OldDateTimeAPI {
    public static void main(String[] args) throws Exception {

        Date date1 = new Date();
        Thread.sleep(1000);
        Date date2 = new Date();

        long time = java.lang.System.currentTimeMillis();
//        System.out.println("Date : " + date1);
//        System.out.println("MilliSecs : " + time);
//        System.out.println(date2.after(date1));
//        System.out.println(date2.compareTo(date1));



        /* Calender API */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        int year       = calendar.get(Calendar.YEAR);
        int month      = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

        int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute     = calendar.get(Calendar.MINUTE);
        int second     = calendar.get(Calendar.SECOND);
        int millisecond= calendar.get(Calendar.MILLISECOND);

//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(dayOfMonth);
//        System.out.println(dayOfWeek);
//        System.out.println(weekOfYear);
//        System.out.println(weekOfMonth);
//
//        System.out.println();
//
//        System.out.println(hour);
//        System.out.println(hourOfDay);
//        System.out.println(minute);
//        System.out.println(second);
//        System.out.println(millisecond);

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        String dateString = "2011-01-18";
        Date parse = sdf.parse(dateString);
        System.out.println(parse);
        System.out.println(sdf.format(new Date()));
    }
}
