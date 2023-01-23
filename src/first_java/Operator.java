package first_java;
import java.util.Objects;
import  java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter 2  integers and an operator : ");
        num1=input.nextInt();
        num2=input.nextInt();
        String operator;
        input.nextLine();
        operator= (input.nextLine());
        if(Objects.equals(operator, "+")){
            System.out.println("sum is "+ (num1+num2));
        }
        if (Objects.equals(operator, "-")){
            System.out.println("difference is "+ (num1-num2));
        }
        if(Objects.equals(operator, "*")){
            System.out.println("the product is "+ num1*num2);
        }
        if(Objects.equals(operator, "/")){
            System.out.println("the quotient of num1/num2=" + num1/num2);
        }
    }
}
