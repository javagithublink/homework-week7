package homework;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Question20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int b = input.nextInt();
        int c = 5;
        boolean check = false; // need to initialize boolean value, otherwise it will give you an error
        int[] a = new int[c];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for (int i = 0; i < c; i++) {

            if (a[i] == b) {
                check = true;
                break;
            }

        }

        if (check){ // if check = true, then only if condition will be satisfied
            System.out.println("Value is in the Array");
        }else{
            System.out.println("Value is not in the Array");
        }

        input.close();
    }

}


