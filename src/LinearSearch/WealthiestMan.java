package LinearSearch;

public class WealthiestMan {
    public static void main(String[] args) {
        //int arr[][]= {{1,353,5325},{123,2215,2363},{34,3535,623,3413},{23,53532,63532,64234},{2124,632,421421}};
        int [][]arr= {{1,2,3},{4,5,6},{1,2,3}};
        System.out.println(wealth(arr));

    }
    static int wealth(int [][]arr){
        int max= Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){
            int total=0;
            for (int j=0;j<arr[i].length;j++){
                total+=arr[i][j];

            }
            if(total>max){
                max=total;
            }
        }
        return  max;
    }
}
