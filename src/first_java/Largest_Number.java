package first_java;
import  java.util.Scanner;
public class Largest_Number {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num1,num2;
        System.out.println("enter num1 and num2 ");
        num1=input.nextInt();
        num2=input.nextInt();
        if(num1>num2){
            System.out.println(num1 +"is the greater number ");
        }
        if(num1==num2){
            System.out.println(" num1 is equal to num2 = "+num2);
        }
        else {
            System.out.println("the greatest number is "+ num2);
        }
    }
}
