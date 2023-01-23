package methods;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
       sum();
        System.out.println("the sum of two numbers is "+ sum2());
        /*
        access_modifier return typen name(){
        // body
        return statement;
        }
         */
        int ans=sum3(10,30);
        System.out.println(ans);
    }
    // pass the value of the numbers when we r calling the method - can be done through parameters
    static  int sum3(int a , int b){
        int sum= a+b;
        return sum;
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two numbers ");
        int num1 = input.nextInt();
        int num2 =input.nextInt();
        int total= num1+num2;
        System.out.println("the sum of the two numbers is " + total);
    }
    static  int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two numbers ");
        int num1= input.nextInt();
        int num2 = input.nextInt();
        int total = num1+num2;
        return  total;
    }
}
