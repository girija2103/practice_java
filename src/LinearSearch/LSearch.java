package LinearSearch;
/*
time complexity = best case =O(1), worst case O(N)
1 comparison or check in the best case
size of the array doesnt matter in the best case,
worst case, element not found in the entire array , even after iterating or going through the entire array
*/
import java.util.Scanner;
public class LSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("enter the array of length 10 : ");
        int [] arr= new int[10];
        arrayInit(arr);
        System.out.println("enter the number to be searched ! : ");
        int num= input.nextInt();
        lSearch(arr,num);
        if(lSearch(arr,num)==(-1)){
            System.out.println("number not found ! ");
        }else {
            System.out.println(lSearch(arr,num));
        }

    }
    static  void arrayInit(int []arr){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the elements of the array of length "+ arr.length);
        for (int i=0;i<arr.length;i++){
            arr[i]= input.nextInt();
        }
    }
    static int lSearch(int []arr, int num){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
//        this line will execute , hence the target has not been found
        return -1;
    }
}
