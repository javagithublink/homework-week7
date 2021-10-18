package homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * (use switch) if any other alphabet should be invalid entry
 */
public class Question9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Write first letter of city (A to F only) :");
        String a = input.nextLine();
        // switch (expression) statement used
        switch (a.toUpperCase()){

            case "A":
                System.out.println("City is Ahemdabad");
                break; // to skip checking other "cases" if condition is true
            case "B":
                System.out.println("City is Baroda");
                break;
            case "C":
                System.out.println("City is Chicago");
                break;
            case "D":
                System.out.println("City is Delhi");
                break;
            case "E":
                System.out.println("City is Esmeraldas");
                break;
            case "F":
                System.out.println("City is Florence");
                break;
            default: // default is not mandatory, but allows us to write logic, if none of the cases are true.
                System.out.println("# Error: Invalid entry");

        }
        input.close();
    }
}
