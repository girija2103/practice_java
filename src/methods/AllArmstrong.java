package methods;
import java.util.Scanner;
public class AllArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the max Range ");
        int num=input.nextInt();
        System.out.println("enter the starting range ");
        int start=input.nextInt();

        armStrongList(num,start);


    }
    static void armStrongList(int num,int start) {
        int total=0;
        for (int i = start; i <= num; i++) {
            int count=0;
            int temp_var=i;
            while(temp_var>0){
                count++;
                temp_var=temp_var/10;
            }
            int length=count;

            int temp=i;
            int sum=0;
            int remainder=0;
            while(temp>0){
                remainder=temp%10;
                sum+=Math.pow(remainder,length);
                temp=temp/10;
            }

            if(sum==i){
                total++;
                System.out.print(i+"   ");
            }
        }
        System.out.println(" ");
        System.out.println();
        System.out.println("the total number of armstrong number :"+ total);
    }
}
