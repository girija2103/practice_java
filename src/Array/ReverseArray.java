package Array;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= new int[10];
        initialize(arr);

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void initialize(int []arr){
        System.out.println("enter the 10 elements of the array datatype:INTeger");
        Scanner input=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

    }
    static void reverse(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(start,end,arr);
            start++;
            end--;
        }
    }
    static void swap(int a, int b, int []arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
//    works for ODD NUMBER OF ELEMENTS
//    static void reverse(int []arr){
//        for (int i=0;i<=((arr.length)/2);i++){
//            int temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//    }
}
