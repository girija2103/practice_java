package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums={5,7,7,7,7,8,9,9,10};
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to be searched ");
        int target= input.nextInt();
        int [] ans=searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }
    public static  int[] searchRange(int [] nums, int target){
        int[] ans= {-1,-1};
//        check for first occurence of target first
        int start=search(nums, target, true);
        int end=search(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int  search(int [] nums, int target, boolean firstIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (target< nums[mid] ){
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }
            else{
//                potential ans is found
                ans=mid;
                if(firstIndex==true){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
