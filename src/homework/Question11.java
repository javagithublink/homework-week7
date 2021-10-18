package homework;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */

public class Question11 {

    public static void main(String[] args) {

        // separate for loops to output both ranges

        for (int a = 1; a <= 100; a++) {

            if (a % 3 == 0) {
                System.out.print(a + " ");
            }


        }
        System.out.println(""); // to print both ranges on separate rows
        for (int a = 1; a <= 100; a++) {

            if (a % 5 == 0) {
                System.out.print(a + " ");
            }
        }

    }
}