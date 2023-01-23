package Conditional_Loops.Assignment;
import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("enter the radius of the circle , to quit enter -1");
            double radius=input.nextDouble();
            if(radius!=(-1)) {
                circleArea(radius);
            } else if (radius==(-1)) {
                break;
            }
        }
    }
    static void circleArea(double radius ){
        double area;
        if(radius >0){
            area=3.14*Math.pow(radius,2);
            System.out.println(area+" units");
        }
        else {
            System.out.println("print invalid input ! ");
        }

    }
}

