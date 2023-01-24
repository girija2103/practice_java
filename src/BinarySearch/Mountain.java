package BinarySearch;

public class Mountain {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,5,4,3,2,1};
        int ans= mountain(arr);
        System.out.println("the max element is "+ ans);
    }

    static int mountain(int[] arr){
        int start=0;
        int end= arr.length-1;
        //int ans=0;
        while(start<end){
            int mid= start + (end-start)/2;
            //case1- arr[mid] > arr[mid+1]
            // mid might be the answer but look into the left hand side of the array
            if(arr[mid]> arr[mid+1]){
                end=mid;
            }
            //case 2 arr[mid] <arr[mid+1]
            //start=mid+1
            //ascending part of the array

            else if (arr[mid]<arr[mid+1]) {
                start=mid+1;
            }

        }
        //in the end, start==end and will be pointing at the max element
        //start and end are trying to point at the max element in the two checks
        return arr[start];
    }
}
