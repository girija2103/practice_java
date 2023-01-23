package methods;
//OCCURS DURING COMPILATION
//EITHER DIFFERENT NUMBER OF ARGUMENTS OR DIFFERENT TYPE OF ARGUMENT( when number of arguments is same )
public class Overloading {
    public static void main(String[] args) {
        fun(3, 6);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
    static void fun(int a , int b){
        System.out.println(a +" " + b);
    }
}
