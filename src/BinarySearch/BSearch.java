package BinarySearch;

import java.util.Scanner;

public class BSearch {
    public static void main(String[] args) {
        int [] arr= {-100,-64,-53,-41,-33,-25,-2,0,10,45,67,89,567,4456,9966};
        Scanner input = new Scanner(System.in);
        System.out.println("enter the target element ");
        int target=input.nextInt();
        int ans= binarySearch(arr,target);
        if(ans==-1){
            System.out.println("OOPS ! element not found ");
        }
        else {
            System.out.println("Element found at :index  " + ans);
        }
    }
    static int binarySearch(int []arr, int target){
        int start=0;
        int end = arr.length-1;

        while (start<=end){
//            finding the middle element
//            int mid= s+e/2
            int mid = start+((end-start)/2); // to handle large range of integers ,to prevent out of bound
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
