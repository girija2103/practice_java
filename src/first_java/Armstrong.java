package first_java;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int num;
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number(ARMSTRONG CHECK) ");
        num=input.nextInt();
        int n=num;
        int temp=0;
        while (n>0){
            temp=temp+(n%10)^3;
            n=n/10;
        }
        if(temp==num){
            System.out.println("the number is an ARMSTRONG NUMBER ");
        }
        else{
            System.out.println("the number is not an armstrong number");
        }

    }
}
