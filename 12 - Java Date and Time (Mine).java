import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

class Result {
    
    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, day);
        calendar.set(Calendar.MONTH, month-1); //bcz january = 0
        calendar.set(Calendar.YEAR, year);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("en", "US")).toUpperCase();
    }

}

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        
        String Day = Result.findDay(month, day, year);
        System.out.println(Day);
    }
}
