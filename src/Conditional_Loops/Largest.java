package Conditional_Loops;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the three integers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        int max1= Math.max(c,Math.max(a,b));
        System.out.println("the largest number amongst the three number is : "+ max);
        System.out.println(max1);
    }
}

