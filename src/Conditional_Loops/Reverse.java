package Conditional_Loops;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("enter the number to be reversed ");
        int num=input.nextInt();
//        METHOD 1
        int reverse=0;
        int n=num;
        int n1=num;
        int count=0;
        while (n1>0){
            n1=n1/10;
            count++;
        }
        count--;
        while (n>0){

            reverse+=(n%10)*Math.pow(10,count);
            n=n/10;
            count--;
        }
        System.out.println("the reversed number is "+ reverse);
//        METHOD 2

        int copy=num;
        int ans=0;
        while (copy>0){
            int rem= copy%10;
            ans=ans*10+rem;
            copy/=10;
        }
        System.out.println(ans);
    }
}
