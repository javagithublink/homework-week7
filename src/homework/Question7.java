package homework;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */


public class Question7 {

    public static void main(String[] args) {
        // local variables
        int sId,sBasic;
        float commission, sAmount;
        String name;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter seller's name : ");
        name = input.nextLine();
        System.out.print("Enter sale ID : ");
        sId = input.nextInt();
        System.out.print("Enter basic salary : ");
        sBasic = input.nextInt();
        System.out.print("Enter sale amount : ");
        sAmount = input.nextFloat();
        input.close();

        // nested If Else statement

        if(sAmount>=50000){
            commission = (sAmount*35)/100;
        } else if(sAmount>=30000) {
            commission = (sAmount * 20) / 100;
        } else if(sAmount>=20000) {
            commission = (sAmount * 10) / 100;
        } else if(sAmount>=10000) {
            commission = (sAmount * 5) / 100;
        } else{
            commission = (sAmount * 2) / 100;
        }

        System.out.println("****************************");
        System.out.println("Commission : "+commission);
        System.out.println("****************************");
    }

}
