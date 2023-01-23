package BinarySearch;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        int start=0;
        int end=1;
        int []nums={ 2,4,5,6,7,8,9,10,34,67,89,113};
        System.out.println("enter the number to be searched ");
        Scanner input = new Scanner(System.in);
        int target= input.nextInt();
        System.out.println(mainAns(nums,target));

    }
    static int mainAns(int [] nums, int target){
        int start=0;
        int end=1;
        while(target> nums[end]){
            int temp= end+1;
            // doubling the size of the box
            //end= temp*2 +(1);
            end= end+ ((end-start+1)*2);
            start=temp;
//            start=end+1;
//            end=(2*start)+1;
        }
        return binarySearch(nums, target, start,end);

    }
    static int binarySearch(int [] nums, int target, int start , int end) {
//        int start=0;
//        int end= nums.length; // LENGTH DOESNT EXIST IN INFINITE ARRAY

        while (start <= end) {
//            finding the middle element
//            int mid= s+e/2
            int mid = start + ((end - start) / 2); // to handle large range of integers ,to prevent out of bound
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
