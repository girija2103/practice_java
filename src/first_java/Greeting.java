package first_java;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name : ");
        String name = input.nextLine();
        System.out.println("hello "+ name);

    }
}
