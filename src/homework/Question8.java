package homework;

import java.util.Objects;
import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Write first letter of city (A to F only) :");
        String a = input.nextLine();

            // objects.equals ("input string", "string to compare with") gives accurate results for string comparison
            // java.util.Objects library needs to be imported

        if(Objects.equals(a.toUpperCase(), "A")){
            // nested If Else statement
            System.out.println("City is Ahmedabad");
        } else if(Objects.equals(a.toUpperCase(), "B")){
            System.out.println("City is Baroda");
        }else if(Objects.equals(a.toUpperCase(), "C")){
            System.out.println("City is Chicago");
        }else if(Objects.equals(a.toUpperCase(), "D")){
            System.out.println("City is Delhi");
        }else if(Objects.equals(a.toUpperCase(), "E")){
            System.out.println("City is Esmeraldas");
        }else if(Objects.equals(a.toUpperCase(), "F")){
            System.out.println("City is Florence");
        }else{
            System.out.println("#Error: Invalid Entry");
        }


        input.close();

    }


}
