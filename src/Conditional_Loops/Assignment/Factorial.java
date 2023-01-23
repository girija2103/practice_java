package Conditional_Loops.Assignment;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("enter the number : " );
            int num=input.nextInt();
            if(num==-1){
                System.out.println("Thank you,\uD83D\uDE80 ");
                break;
            }
            else if (num<0) {
                System.out.println("invalid input ! ");
            }
            else {
                int fact=1;
                for (int i=1;i<=(num);i++){
                    fact=fact*i;
                }
                System.out.println(fact);
                System.out.println();
            }
        }
    }
}
