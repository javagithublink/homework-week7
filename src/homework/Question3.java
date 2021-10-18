package homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
 * and find out total, percentage and result.
 *
 * If he is pass or fail on basis of percentage (pass>=35)
 * and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Question3 {
    // static variables used for whole programme
    static int sId, math, sci, eng, total;
    static String result, grade, name;
    static float percentage;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = input.nextLine();
        System.out.print("Enter Roll No: ");
        sId = input.nextInt();
        System.out.print("Enter Maths marks: ");
        math = input.nextInt();
        System.out.print("Enter Science marks: ");
        sci = input.nextInt();
        System.out.print("Enter English marks: ");
        eng = input.nextInt();
        input.close(); // scanner closed

        result = null; // variable value initialised
        grade = null; // variable value initialised

        total = math + sci + eng;
        percentage = ((math + sci + eng) * 100 / 300);
        // If Else statement
        if (math < 35 || sci < 35 || eng < 35) {
            result = "FAIL";
            grade = "N/A";
            markSheet(); // static method
        } else if (math > 100 || sci > 100 || eng > 100) {
            System.out.println("# Error: Marks should be between 0 to 100");

        } else if (percentage >= 80) {
            result = "Pass";
            grade = "A+";
            markSheet();
        } else if (percentage >= 60) {
            result = "Pass";
            grade = "A";
            markSheet();
        } else if (percentage >= 50) {
            result = "Pass";
            grade = "B";
            markSheet();
        } else if (percentage >= 35) {
            result = "Pass";
            grade = "C";
            markSheet();
        } else {
            result = "FAIL";
            grade = "N/A";
            markSheet();
        }

    }

// markSheet() method used, so that if marks are >100, programme terminates with error message and doesn't print marksheet
// marksheet borders aligned for test data only

    public static void markSheet() {
        System.out.println(" ----------------------------------------");
        System.out.println("|                                        |");
        System.out.println("|               Mark Sheet               |");
        System.out.println("|________________________________________|");
        System.out.println("|         Name       :      " + name + "          |");
        System.out.println("|         Roll No    :      " + sId + "            |");
        System.out.println("|________________________________________|");
        System.out.println("|         Subjects    :    Marks         |");
        System.out.println("|________________________________________|");
        System.out.println("|         Maths       :  " + math + "              |");
        System.out.println("|         Science     :  " + sci + "              |");
        System.out.println("|         English     :  " + eng + "              |");
        System.out.println("|________________________________________|");
        System.out.println("|         Total       :  " + total + "             |");
        System.out.println("|________________________________________|");
        System.out.println("|         Percentage  :  " + percentage + "            |");
        System.out.println("|         Result      :  " + result + "            |");
        System.out.println("|         Grade       :  " + grade + "              |");
        System.out.println("|________________________________________|");


    }

}

