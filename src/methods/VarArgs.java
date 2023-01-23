package methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("girija","savita","kavita","human");
        multiple(1,3,"girija", "shivam ", "pari");
    }
    static void fun(String... v){
        System.out.println(Arrays.toString(v));
    }
//    variable length arguments always come in the end
    static void multiple(int a, int b , String ...v){
        System.out.println(Arrays.toString(v)+" "+ a +" "+b);
    }
}
