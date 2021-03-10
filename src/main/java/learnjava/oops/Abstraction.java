package learnjava.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Abstraction extends Database implements IDataOperations{

    public Abstraction(String name) {
        super(name);
        System.out.println("Abstraction class constructor");
    }

    static {
        System.out.println("Abstraction class static block");
    }


    public static void main(String[] args) {
        System.out.println("Hello Main method");
        //System.out.println(getWeekNoFromDate(new Date().toString()));
        //Developer d = new Developer();
        // System.out.println(new Abstraction("Yellow").user());
    }

    private static int getWeekNoFromDate(String sDate) {
        SimpleDateFormat f = new SimpleDateFormat("ddMMyyyy");
        try {
            Date d = f.parse(sDate);
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            return cal.get(Calendar.WEEK_OF_YEAR);
        } catch (ParseException e) {
           // logger.error("getting error in parse date for week no {} " , sDate);
        }
        return 0;
    }

    @Override
    public String user() {
        return "hadoop";
    }

    @Override
    public void insertData() {
        System.out.println(DB_NAME);
    }

    @Override
    public void updateData() {

    }

    @Override
    public int totalTables() {
        return 0;
    }

    @Override
    public int totalConnections() {
        return 0;
    }
}