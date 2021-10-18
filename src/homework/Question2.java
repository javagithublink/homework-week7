package homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Question2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any year in 4 digits :");
        int a = input.nextInt();

        // If Else conditional statement used

        if(a%4==0 && a%400!=0 && a%100!=0){
            System.out.println("This is leap year"); // true body
        }else{
            System.out.println("This is not leap year"); // false body
        }

        input.close();
    }

}
