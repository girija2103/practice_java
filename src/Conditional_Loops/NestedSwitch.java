package Conditional_Loops;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        int e_id;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the employee id ");
        e_id= input.nextInt();
        input.nextLine();
        System.out.println("enter the department ");
        String department= input.nextLine();
//        switch (e_id){
//            case 1:
//                System.out.println("CEO Girija ");
//                break;
//            case 2:
//                System.out.println("CFO Shivam Dwivedi ");
//                break;
//            case 3:
//                System.out.println("EMPLOYEE 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//
//                    case "PR":
//                        System.out.println("HR AND PR DEPARTMENT ");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("INVALID INPUT ");
//        }
         // BETTER WAY TO WRITE THE CODE!
        switch (e_id) {
            case 1 -> System.out.println("CEO Girija ");
            case 2 -> System.out.println("CFO Shivam Dwivedi ");
            case 3 -> {
                System.out.println("EMPLOYEE 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "PR" -> System.out.println("HR AND PR DEPARTMENT ");
                }
            }
            default -> System.out.println("INVALID INPUT ");
        }
    }
}
