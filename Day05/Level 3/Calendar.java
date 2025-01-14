import java.util.Scanner;

public class Calendar {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        return (month == 2) ? (isLeapYear(year) ? 29 : 28) : 
               (month == 4 || month == 6 || month == 9 || month == 11 ? 30 : 31);
    }

    public static int getFirstDay(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    public static void displayCalendar(int month, int year) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        System.out.printf("\n  %s %d\nSun Mon Tue Wed Thu Fri Sat\n", months[month - 1], year);
        int firstDay = getFirstDay(month, year);
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int day = 1, days = getDaysInMonth(month, year); day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        displayCalendar(month, year);
        sc.close();
    }
}
