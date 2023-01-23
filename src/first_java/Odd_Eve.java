package first_java;
import java.util.Scanner;
public class Odd_Eve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number (ODD or EVE CHECK) ");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("the number "+ num + " is an even number ");
        }
        else {
            System.out.println("the number "+num+" is an odd number ");
        }
    }
}
