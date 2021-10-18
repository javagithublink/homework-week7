package homework;

import java.util.Objects;
import java.util.Scanner;

/**
 * 10. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Question10 {
    static int a, b;

    public static void addition() {
        System.out.println("Result: " + (a + b));
    }

    public static void multiplication() {
        System.out.println("Result: " + (a * b));
    }

    public static void subtraction() {
        System.out.println("Result: " + (a - b));
    }

    public static void division() {
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {

        String c, d, e, f;
        String add, sub, mul, div;

        // declare symbols as string variables
        add = "+";
        sub = "-";
        mul = "*";
        div = "/";

        Scanner input = new Scanner(System.in);
        System.out.println("Choose '+' for Addition, '-' for Subtraction, '*' for Multiplication or '/' for Division");
        c = input.nextLine();

        System.out.print("Enter First Number: ");
        a = input.nextInt();
        System.out.print("Enter Second Number: ");
        b = input.nextInt();

        // objects.equals ("input string", "string to compare with") gives accurate results for string comparison
        // java.util.Objects library needs to be imported

        if (Objects.equals(c, add)) {
            addition();

        } else if (Objects.equals(c, sub)) {
            subtraction();

        } else if (Objects.equals(c, mul)) {
            multiplication();

        } else if (Objects.equals(c, div)) {
            division();

        } else {
            System.out.println("# Error: Invalid entry");
        }


        input.close();

    }


}
