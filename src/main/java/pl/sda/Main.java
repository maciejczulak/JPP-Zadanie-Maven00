package pl.sda;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What day was yesterday?");
    int day = sc.nextInt();
    System.out.println("What month is today?");
    int month = sc.nextInt();
    System.out.println("What year is today?");
    int year = sc.nextInt();
    LocalDate yesterday = LocalDate.of(year, month, day);
    LocalDate today = LocalDate.now();
    System.out.println("Yesterday was " + yesterday);
    System.out.println("Today is " + today);

    System.out.println("Years last: "+ChronoUnit.YEARS.between(yesterday, today));
    System.out.println("Months last: "+ChronoUnit.MONTHS.between(yesterday, today));
    System.out.println("Days last: "+ChronoUnit.DAYS.between(yesterday, today));

    }

}
