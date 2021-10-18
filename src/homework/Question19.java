package homework;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Question19 {

    public static void main(String[] args) {
        int b = 5; // int array with 5 values
        int[] a = new int[5]; // we can put int variable into array to represent values of locations
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;


        System.out.println("Array : ");
        int sum= 0;
        for (int i = 0; i < b; i++) {
            System.out.println(" "+a[i]+" ");
            sum += a[i];


        }
        int avg = (sum/b);
        System.out.println("Average of Array : "+ avg);
    }

}
