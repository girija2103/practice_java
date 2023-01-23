package Conditional_Loops;
import java.util.Scanner;
public class CountingSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        long num= input.nextLong();
        System.out.println("enter the integer whose repetition is to be counted");
        int int_r= input.nextInt();
        long n=num;
        int count =0;
        while (n>0){
            long temp=n%10;
            if(temp==int_r){
                count++;
            }
            n=n/10;
        }
        System.out.println("the integer is repeated "+ count+" times");
    }
}
