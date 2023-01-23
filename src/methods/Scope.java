package methods;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="kunal";
        {
            a=78;
            int c=8;
//            values initialized in the block remain in the block
//            already initialized outside the block cannot be initiated again
            name="rahul";
        }
        System.out.println(a);
        System.out.println(name);
        System.out.println("Value of 'a '  and 'name ' is changed");
    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
//    anything that is initialised outside the block can be used inside the block , but not the other way around
}
