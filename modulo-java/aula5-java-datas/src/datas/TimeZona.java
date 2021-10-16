package datas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZona {
    public static void main(String[] args) {
        Calendar euroCal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Tiraspol"));
        System.out.println(euroCal);
    }
}
