package homework;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

public class Question16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int a = input.nextInt(); // user input stored into local variable

        // nested If Else statement

        if (a > 0) {
            System.out.println("This is POSITIVE number");
        } else if (a < 0) {

            System.out.println("This is NEGATIVE number");
        } else {
            System.out.println("This is ZERO");
        }


        input.close();
    }


}
