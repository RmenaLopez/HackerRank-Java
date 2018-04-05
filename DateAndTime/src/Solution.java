import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

    public static String getDay(String day, String month, String year){
        Calendar calendar = new GregorianCalendar(
                Integer.parseInt(year),
                Integer.parseInt(month)-1,
                Integer.parseInt(day)
        );

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        return sdf.format(calendar.getTime()).toUpperCase();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }



}
