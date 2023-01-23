package methods;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("enter the number !");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int numDigits=intLength(num);
        boolean result= isArmstrong(num,numDigits);
        System.out.println(result);


    }
    static int intLength(int num){
        int length=0;
        while (num>0){
            length++;
            num=num/10;
        }
        return length;
    }
    static boolean isArmstrong(int num,int numDigits){
        int temp=num;
        int sum=0;
        int remainder=0;
        while(temp>0){
            remainder=temp%10;
            sum+=Math.pow(remainder,numDigits);
            temp=temp/10;
        }
        return sum==num;
    }
}
