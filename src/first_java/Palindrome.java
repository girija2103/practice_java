package first_java;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String p_string;
        System.out.println("enter the string to check for palindrome");
        Scanner input = new Scanner(System.in);
        p_string= input.nextLine();
        String r="";
        for(int i=p_string.length()-1;i>=0;i--){
            r=p_string.charAt(i)+r;
        }
        if(r.equals(p_string)){
            System.out.println("the string is a palindrome ");
        }
        else {
            System.out.println("the string is not a palindrome");
        }
    }
}
