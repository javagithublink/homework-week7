package homework;

/**
 * Write a method isLeapYear with a parameter of type int named year. The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false. Otherwise, if it is in the valid range,
 * calculate if the year is a leap year and return true if it is, otherwise return false. A year is a leap year
 * if it is divisible by 4 but not by 100, or it is divisible by 400.
 *
 * Write another method getDaysInMonth with two parameter month and year. Both of type int. If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1. This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February). You should check if the year is a leap year using the method isLeapYear describe above.
 */
public class Question4 {
    int year; // instance variable

    public static void isLeapYear(int year) { // parameter is local variable for this method

        if (year <= 1 || year >= 9999) {
            System.out.println("parameter is not in the rage(1-9999)");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }


    }
    // static method

    public static void getDaysInMoth(int month, int year) {

        if (month < 1 || month > 12) {
            System.out.println("-1 - Invalid Month");
        } else if (year < 1 || year > 9999) {
            System.out.println("-1 - Invalid Year");
        } else {                                        // nested switch () statement under else statement
            switch (month) {

                case 1:
                    System.out.print("Month is January with 31 day and ");
                    isLeapYear(year);
                    break;
                case 2: // nested If Else statement under switch () statement to get correct number of days for Feb, for leap year
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.print("Month is February with 29 days and ");
                        isLeapYear(year);
                    } else {
                        System.out.print("Month is February with 28 days and ");
                        isLeapYear(year);
                    }
                    break;
                case 3:
                    System.out.print("Month is March with 31 day and ");
                    isLeapYear(year);
                    break;
                case 4:
                    System.out.print("Month is April with 30 day and ");
                    isLeapYear(year);
                    break;
                case 5:
                    System.out.print("Month is May with 31 day and ");
                    isLeapYear(year);
                    break;
                case 6:
                    System.out.print("Month is June with 30 day and ");
                    isLeapYear(year);
                    break;
                case 7:
                    System.out.print("Month is July with 31 day and ");
                    isLeapYear(year);
                    break;
                case 8:
                    System.out.print("Month is August with 31 day and ");
                    isLeapYear(year);
                    break;
                case 9:
                    System.out.print("Month is September with 30 day and ");
                    isLeapYear(year);
                    break;
                case 10:
                    System.out.print("Month is October with 31 day and ");
                    isLeapYear(year);
                    break;
                case 11:
                    System.out.print("Month is November with 30 day and ");
                    isLeapYear(year);
                    break;
                case 12:
                    System.out.print("Month is December with 31 day and ");
                    isLeapYear(year);
                    break;

            }

        }

    }

    public static void main(String[] args) {

        isLeapYear(1600);                           // static method called directly inside main()
        getDaysInMoth(1, -2020);        // static method called directly inside main()

    }

}


