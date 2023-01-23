package basic_java;
import org.w3c.dom.ls.LSInput;

import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        System.out.print("enter your roll number : ");
        Scanner input = new Scanner(System.in);
        int roll_no = input.nextInt();
        System.out.println("the roll number of the student is : "+ roll_no);
//        literals are the syntactic representation of char, int , boolean data//
//        reference variables are known as the identifiers
//        int a= 234_000_000 = 234,000,000
        System.out.println("enter your name : ");
        String name= input.next();
        System.out.println(name);
        input.nextLine();
        float num= input.nextFloat();
        System.out.println(num);

    }
}
