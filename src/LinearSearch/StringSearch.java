package LinearSearch;
import java.util.Scanner;
public class StringSearch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the string input ");
        String name = input.nextLine();
        System.out.println("enter the character to be searched ");
        char ch= input.next().charAt(0);
        if(stringSearch(name,ch)==-1){
            System.out.println("character not found ");
        }
        else {
            System.out.println("character found at index "+ stringSearch(name,ch));
        }
    }
    static int stringSearch(String name, char ch){
        if(name.length()==0){
            return -1;
        }
        for (int i=0;i<name.length();i++){
            if(name.trim().charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}
