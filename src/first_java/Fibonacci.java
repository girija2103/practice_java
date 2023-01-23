package first_java;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number n for the fibonacci series" );
        int n= input.nextInt();
        int num1=0;
        int num2=1;
        int num3=0;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for (int i=3;i<=n;i++){
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
        }
    }
}
