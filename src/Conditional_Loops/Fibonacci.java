package Conditional_Loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a=0;
        int b=1;
        int count=2;
        System.out.println("enter the nth term of Fibonacci series to be found ");
        int num=input.nextInt();
        while (count<=num){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println("the "+ num+ " term of the fibonacci series is "+ b);
    }
}
