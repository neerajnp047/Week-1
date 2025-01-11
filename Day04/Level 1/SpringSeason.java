import java.util.Scanner;

public class SpringSeason {
    public static boolean MonthAndDay(int month, int day){
        if((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <=20)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Month");
        int month = sc.nextInt();
        System.out.println("Enter a Day");
        int day = sc.nextInt();

        SpringSeason  season = new SpringSeason();


        System.out.println(season.MonthAndDay(month, day));

    }
}
