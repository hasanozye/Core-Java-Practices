package BasicLevelProblemSolvings.hackerrankstuff;

import java.util.Calendar;

public class DateAndTime {
    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the year, month, and day
        calendar.set(year, month - 1, day);

        // Get the day of the week as an integer (1 = Sunday, 2 = Monday, ..., 7 = Saturday)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Convert the integer to the corresponding day name in capital letters
        String[] daysOfWeek = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        String dayName = daysOfWeek[dayOfWeek];

        return dayName;

    }

    public static void main(String[] args) {
        // Sample input
        int month = 8;
        int day = 5;
        int year = 2015;

        // Call the findDay function and print the result
        String result = findDay(month, day, year);
        System.out.println(result);
    }

}
