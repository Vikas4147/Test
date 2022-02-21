package com.company.PractiseSet4;
import java.util.Scanner;

public class IncomeTax {
    public static void main (String[] args){
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter your income in lakhs:");
        double tax = 0.0d;
        float income =sc.nextFloat();

        if(income>=2.5 && income<5){
            tax= tax +0.05d*(income-2.5);
            System.out.println("You need to pay 5% tax:"+tax);
        }else if(income>=5 && income<=10){
            tax= tax +0.05d*(income-2.5);
            tax= tax +0.2d*(income-5);
            System.out.println("You need to pay 20% tax:"+tax);
        }else if(income>10){
            tax= tax +0.05d*(income-2.5);
            tax= tax +0.2d*(income-5);
            tax= tax +0.3d*(income-10);
            System.out.println("You need to pay 30% tax:"+tax);
        }else{
            System.out.println("Workhard so that you can pay tax ");
        }


    }
}
