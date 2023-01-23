package first_java;
import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principle,time, rate;
        System.out.println("enter the principle , time and rate of the SI: ");
        principle= input.nextDouble();
        time=input.nextDouble();
        rate=input.nextDouble();
        double s_interest= principle*rate*time;
        double amount = principle+s_interest;
        System.out.println("the simple interest and the amount of the principle are "+ s_interest +" " + amount);
    }
}
