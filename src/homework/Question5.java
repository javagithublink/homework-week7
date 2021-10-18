package homework;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

public class Question5 {

    public static void main(String[] args) {
        // local variables
        float hra, da, ta,pf,gs,basic;
        int eId;
        String name;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter Empolyee name: ");
        name = input.nextLine();
        System.out.print("Enter Emplyee ID: ");
        eId = input.nextInt();
        System.out.print("Enter Basic Salary: ");
        basic = input.nextFloat();
        input.close();

        hra = (basic*10)/100;
        da = (basic*8)/100;
        ta = (basic*9)/100;
        pf = (basic*20)/100;
        gs = (basic+hra+ta+da)-pf;

        // borders are aligned for test data only
        System.out.println("---------------------------------");
        System.out.println("|          Salary Slip          |");
        System.out.println("|_______________________________|");
        System.out.println("| Employee Id     :"+eId+"         |");
        System.out.println("| Employee Name   :"+name+"          |");
        System.out.println("|_______________________________|");
        System.out.println("| Basic Salary    :"+basic+"      |");
        System.out.println("| HRA 10%         :"+hra+"       |");
        System.out.println("| TA 8%           :"+ta+"       |");
        System.out.println("| DA 9%           :"+da+"       |");
        System.out.println("| PF -20%         :"+pf+"       |");
        System.out.println("|_______________________________|");
        System.out.println("| Gross Salary    :"+gs+"      |");
        System.out.println("|===============================|");



    }

}
