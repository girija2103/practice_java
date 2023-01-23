package methods;

public class Shadowing {
    static int x=100;//this will be shadowed @ line 9
    public static void main(String[] args) {
        System.out.println(x);
        fun();
        int x=20;// the class variable at line 4 is shadowed by this
//        scope will begin when the value is initialised
        System.out.println(x);
    }
    static  void fun(){
        System.out.println(x);
    }
}
