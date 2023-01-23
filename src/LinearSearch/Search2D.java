package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        int [][]arr=  {{1,2,3},{34,56,74},{34,5634,745424},{32423,3263,156},{236,4632,3252}};
        System.out.println(Arrays.toString(search(arr)));

    }
    static int [] search(int [][] arr){
        System.out.println("enter the number to be searched ");
        int target;
        int [] ans={-1,-1};
        Scanner input = new Scanner(System.in);
        target=input.nextInt();
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}
