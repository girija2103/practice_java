package LinearSearch;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        int [] arr= new int[10];
        arrInit(arr);
        int []result = maxMin(arr);
        System.out.println("the max is "+result[0]+"\nthe minimum is "+ result[1]);
    }
    static void arrInit(int []arr){
        System.out.println("enter the elements of the array of length  : " + arr.length);
        Scanner input = new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }
    static int[] maxMin(int []arr){
        int max,min;
        max=min=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int []result={max, min};
        return result;
    }
}
