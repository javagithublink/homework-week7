package homework;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days name MONDAY,
 * TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Question13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number between 1 to 7 : ");
        int a = input.nextInt();

        // switch () statement with user inputs using Scanner

        switch (a) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }


        input.close();
    }

}
