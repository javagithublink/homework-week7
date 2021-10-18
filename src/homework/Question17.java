package homework;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Question17 {
    public static void main(String[] args) {
        int[] a = {697, 593, 495, 3040, 584, 283, 596, 485}; // int array used to store more than one values
        String[] b = {"Mehul", "Chetan", "Kinjal", "Dhara", "Shama", "Jimil"}; // String array used to store more than one values

        System.out.println("Original Numeric Array: " + Arrays.toString(a));        // String representation of original int array
        Arrays.sort(a);                                                           // to sort array "a[]" into ascending order
        System.out.println("Numeric Array after sorting: " + Arrays.toString(a));   // String representation of assorted array
        System.out.println("Original String Array: " + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("String Array after sorting: " + Arrays.toString(b));

    }
}
