package Conditional_Loops;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the character ");
        char ch= input.next().trim().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println("the character is a lower case alphabet ");
        } else if (ch>='A'&& ch<='Z') {
            System.out.println("the character is an upper case alphabet");
        }
        else{
            System.out.println("the character is not an alphabet ");
        }
        // trim() is used to remove all the blank spaces before and after the text entered
        // no Scanner method for character hence , input.next().trim().chartAt(x)
    }
}
