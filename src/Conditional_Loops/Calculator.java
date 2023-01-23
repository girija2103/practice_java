package Conditional_Loops;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans=0;
        char op;
        while (true){
            System.out.println("enter the operator to be used ");
            op=input.next().trim().charAt(0);
            if(op=='+'|| op=='-'||op=='*'||op=='/'||op=='%') {
                System.out.println("enter the two operands ");
                int num1=input.nextInt();
                int num2=input.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                if (op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num1!=0){
                        ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }

            } else if (op=='x'|| op=='X') {
                break;
            }
            else {
                System.out.println("INVALID OPERATION");
            }
            System.out.println(ans);
        }

    }
}
