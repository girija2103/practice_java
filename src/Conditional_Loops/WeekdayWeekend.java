package Conditional_Loops;
import java.util.Scanner;
public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the day of the week to check for weekday or week end ");
        int day = input.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("WEEKEND !! ");
                break;
            default:
                System.out.println("INVALID INPUT ");
        }


        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("WEEKEND !! ");
            default -> System.out.println("INVALID INPUT ");
        }
    }
}
