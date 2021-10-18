package homework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Question12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any value: ");
        char a = input.next().charAt(0);

        // since we used "a" as char variable, hence we need to check "A to Z" and "a to z" both,
        // if we use "a" as String variable, we can use .toUpperCase() extension to convert all inputs into uppercase.

        if (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
            System.out.println("This is Alphabet");
        } else if (a >= '0' && a <= '9') {
            System.out.println("This is Number");
        } else {
            System.out.println("This is Symbol");
        }
        input.close();
    }

}
