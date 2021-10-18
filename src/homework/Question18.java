package homework;

/**
 *Write a Java program to sum values of an array.
 */

public class Question18 {

    public static void main(String[] args) {

        int[] a = new int[5]; // int array with 5 values
        a[0] = 1; // a[0] location on array
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;


        System.out.println("Array : ");
        int sum= 0; // initializing sum variable

        // for loop to add array values

        for (int i = 0; i < 5; i++) {
            System.out.println(" "+a[i]+" ");
            sum += a[i];

        }

        System.out.println("Sum of Array : "+ sum);
    }
}
