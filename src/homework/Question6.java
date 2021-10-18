package homework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Question6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner with name "input" used
        System.out.print("Enter any number: ");
        int a = input.nextInt();
        input.close();
        // If Else statement
        if(a%2==0){
            System.out.println("This is Even Number"); // true body
        }else{
            System.out.println("This is Odd Number"); // false body
        }

    }
}
