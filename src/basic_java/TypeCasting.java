package basic_java;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        typecasting
        int num = (int) (input.nextFloat());
        System.out.println(num);
//        automatic type promotion in expression
        int a = 258;
        byte b = (byte) (a);
        System.out.println(b);
//        p*q in the intermediate term is performed by considering p and q to be integers
//         as 2000 is out of range of byte

        byte p = 40;
        byte q = 50;
        byte r = 100;
        int z = p * q / r;
        System.out.println(z);
//        JAVA follows unicode system
        System.out.println("こんにちは");
//        type promotion RULES:
/* 1. Byte , short , character are promoted to integer
   2.if any one of the operands is long , the whole operation will be promoted to long
   3.if any one of the operands is float , the whole operation will be promoted to float
   4. similarly for double
   int < long < float < double

 */
    }
}
