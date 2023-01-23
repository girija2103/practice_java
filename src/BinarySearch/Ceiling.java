package BinarySearch;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {-10,-4,-2,-1,0,4,12,34,332,6432};
        int target;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number whose ceiling is to be found : ");
        target=input.nextInt();

        System.out.println(ceiling(arr,target));
        

    }
    static int ceiling(int arr[],int target){
        
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid= start+ (end- start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if( target<arr[mid]){
                end= mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return arr[start];
    }
}
