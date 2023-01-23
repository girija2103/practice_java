package Array;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Scanner;
public class MaxElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr= new int[10];
        arrInput(arr);
        System.out.println("the max element of the array is "+ maxEle(arr));

    }
    static  void arrInput(int [] arr){
        System.out.println("enter the 10 elements of the array : ");
        Scanner input = new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }
    static int maxEle(int [] arr){
        int max=arr[0];
        for (int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

