
import java.util.Scanner;

// This class represents a date with day, month, and year.
 // It also includes methods to display the date in different formats.
public class Date {
    private int day;
    private int month;
    private int year;
    
    private static final String[] MONTH_NAMES = {"January", "February", "March", "April", "May", "June",
                                                 "July", "August", "September", "October", "November", "December"};
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    

    //Constructor that initializes a Date object with the given day, month, and year.
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    //Constructor that initializes a Date object with the given month name, day, and year.
    public Date(String monthName, int day, int year) {
        this.day = day;
        this.year = year;
        this.month = getMonthIndex(monthName);
    }
    

    // Constructor that initializes a Date object with the given day of the year and year.
    public Date(int dayOfYear, int year) {
        this.year = year;
        int totalDays = 0;
        int monthIndex = 0;
        while (totalDays + DAYS_IN_MONTH[monthIndex] < dayOfYear) {
            totalDays += DAYS_IN_MONTH[monthIndex];
            monthIndex++;
        }
        this.month = monthIndex + 1;
        this.day = dayOfYear - totalDays;
    }
    
    // Returns the index of the month name in the MONTH_NAMES array.
    private int getMonthIndex(String monthName) {
        for (int i = 0; i < MONTH_NAMES.length; i++) {
            if (MONTH_NAMES[i].equalsIgnoreCase(monthName)) {
                return i + 1;
            }
        }
        return -1; // Invalid month name
    }
    
    public void displayDate() {
        System.out.printf("%02d/%02d/%d%n", month, day, year);
        System.out.printf("%s %d, %d%n", MONTH_NAMES[month - 1], day, year);
        System.out.printf("%d %d%n", getDayOfYear(), year);
    }
    
    private int getDayOfYear() {
        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += DAYS_IN_MONTH[i];
        }
        return totalDays;
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (as number): ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        Date date1 = new Date(day, month, year);
        
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter month (as name): ");
        String monthName = scanner.nextLine();
        System.out.print("Enter day: ");
        day = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        Date date2 = new Date(monthName, day, year);
        
        System.out.print("Enter day of year: ");
        int dayOfYear = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        Date date3 = new Date(dayOfYear, year);
        
        scanner.close();
        
        System.out.println("Date formats:");
        date1.displayDate();
        System.out.println();
        date2.displayDate();
        System.out.println();
        date3.displayDate();
    }
}
