package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter the five array elements " );
        for (int i=0;i<arr.length;i++) {
            arr[i] = input.nextInt();
        }
        swap(arr);
        System.out.println("after swapping : ");
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two indices to swap ");
        int a= input.nextInt();
        int b=input.nextInt();
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
