package methods;
import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message= greet();
        System.out.println(message);
        System.out.println("enter the name: ");
        String name = input.nextLine();
        String personalise = myGreet(name);
        System.out.println(personalise);

    }

    private static String myGreet(String name) {
        String message= "Hello! 😈  "+ name;
        return message;
    }

    static String greet(){
        String greeting = "how are you ?";
        return  greeting;
        // greeting is redundant , can be || return "how r you?"||
    }
}
