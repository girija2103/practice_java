package first_java;
import java.util.Scanner;
public class Rupee_Dollar {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double rupee,dollar;
        System.out.println("enter the amount in rupees");
        rupee=input.nextDouble();
        dollar=rupee*0.012;
        System.out.println(rupee+" rupee amounts to " + dollar+" dollar");
    }
}
