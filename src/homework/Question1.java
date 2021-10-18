package homework;

import java.util.Scanner;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 *
 */
public class Question1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = input.nextInt(); // scanner input saved in integer "a"


        String b = (a%2==0) ? "This is even number" : "This is odd number."; // ?: ternary operator used instead of If Else

        System.out.println(b);

        input.close();

    }

}
