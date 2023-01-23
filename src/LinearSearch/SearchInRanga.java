package LinearSearch;
import java.util.Scanner;
import java.util.SortedMap;

public class SearchInRanga {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arrIniti(arr);
        int result=rangeSearch(arr);
        if(result==-2){
            System.out.println("range out of bound! ERROR");
        }
        else if(result==-1){
            System.out.println("number not found ! ");
        }
        else {
            System.out.println("Search successful, number found at index "+ rangeSearch(arr));
        }

    }

    static void arrIniti(int []arr){
        System.out.println("enter the elements of array of size "+ arr.length);
        Scanner input = new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }
    static int rangeSearch(int[] arr){
        int start, end,num;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number to be searched ");
        num=input.nextInt();
        System.out.println("enter the starting and ending range of the search ");
        start=input.nextInt();
        end=input.nextInt();

        if(end>=arr.length){
            return -2;
        }
        else {
            for(int i=start;i<=end;i++){
                if(arr[i]==num){
                    return i;
                }
            }
        }
        return -1;
    }
}
