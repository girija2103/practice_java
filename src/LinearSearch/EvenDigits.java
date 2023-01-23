package LinearSearch;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        int []arr= new int[100];
        int length=arrIniti(arr);
        System.out.println(evenCount(arr,  length));

    }
    static int  arrIniti(int []arr){
        int length;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the array (<100): ");
        length=input.nextInt();
        System.out.println("enter the elements of the array ");
        for (int i=0;i<length;i++){
            arr[i]=input.nextInt();
        }
        return length;
    }
    static int numDigit(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 0;
        }
        int temp=num;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        return count;
    }
    static int evenCount(int [] arr, int length){
        int t_count=0;
        for(int i=0;i<length;i++){
            if(numDigit(arr[i])%2==0){
                t_count++;
            }
        }
        return t_count ;
    }
}
