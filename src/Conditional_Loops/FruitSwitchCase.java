package Conditional_Loops;
import java.util.Scanner;
public class FruitSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit;
        System.out.println("enter the name of the fruit ");
        fruit = input.nextLine();
        switch (fruit) {
            case "Mango" -> System.out.println("the king of fruits ");
            case "Apple" -> System.out.println("an apple a day keeps doctor away");
            case "Guava" -> System.out.println("uhmmmmm! yummy yummmmmy juice ");
            case "Watermelon" -> System.out.println("red and black perfect combo");
            default -> System.out.println("INVALID INPUT!");
        }

    }
}
