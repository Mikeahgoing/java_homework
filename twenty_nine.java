package Homework_java;

import java.util.Scanner;

public class twenty_nine {
    public static void main(String[] args) {
        double interest;double principal;double unpaid;double total=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("A loan amount :");
        double amount =sc.nextDouble();
        interest =amount;
        unpaid=amount;
        System.out.print("annual interest rate :");
        double rate =sc.nextDouble()/100/12;
        System.out.print("loan period :");
        int period =sc.nextInt()*12;
        System.out.println("      Payment                                 Unpaid         Total Interest");
        System.out.println("        No.      Interest      Principal     Balance            to  Date   ");
        for(int i=1;i<=period;i++){
            interest = unpaid *rate;
            principal =(amount*rate*Math.pow((1+rate),period))/(Math.pow((1+rate),period)-1)-interest ;
            unpaid =unpaid-principal ;
            total=total+interest ;
            System.out.printf("%9d     %9.2f      %9.2f      %9.2f         %9.2f \n",i,interest,principal,unpaid,total);
        }

    }
}
