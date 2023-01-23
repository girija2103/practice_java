package BinarySearch;

import java.util.Scanner;

// if Sorted Array is given , try binary search !
public class AgnosticBSearch {
    public static void main(String[] args) {
        int [] arr= {-201,-198,-56,-45,-34,-28,-15,-8,-2,5,40,45,67,89,99,104,134,239};
//        int []arr={10343,2323,1034,999,976,897,786,674,347,289,102,98,45,37,28,17,10,-98,-189,-1899,-190808};
        System.out.println("enter the value of the target element ");
        Scanner input = new Scanner(System.in);
        int target=input.nextInt();
        int ans=orderAgnosticBS(arr,target);
        if(ans==-1){
            System.out.println("OOPS! value not found ! ");
        }
        else {
            System.out.println("Successful Order Agnostic Binary Search ! target found at : index "+ ans);
        }

    }
    static int orderAgnosticBS(int [] arr, int target){
        int start=0;
        int end=arr.length-1;
//        find whether array is ordered in ascending or descending order
        boolean isAc;
        isAc= arr[start] <= arr[end];
        while (start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            if(isAc){
                if(arr[mid]>target){
                    end=mid-1;
                } else if (arr[mid]<target) {
                    start=mid+1;
                }
            }else {
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if (target>arr[mid]){
                    end=mid-1;
                }
            }
        }

        return -1;// if element is not found
    }
}
