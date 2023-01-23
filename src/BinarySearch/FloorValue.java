package BinarySearch;

import java.util.Scanner;

public class FloorValue {
    public static void main(String[] args) {
        int arr[] = {-34,-24,-12,-9,-5,-3,-1,0,12,32,244,343,567,8888};
        int target;
        System.out.println("enter the value whose floor value is to be searched ");
        Scanner input = new Scanner(System.in);
        target= input.nextInt();
        System.out.println("the floor value is :  " + ceiling(arr,target));
    }
    static int ceiling (int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return target;
            } else if (target>arr[mid]) {
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
        }
        return arr[end];
    }
}
