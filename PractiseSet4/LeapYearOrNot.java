package com.company.PractiseSet4;
import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Year in YYYY format:");
        int year = sc.nextInt();
        if(year %4 ==0 &&year %100 !=0){
            System.out.println("Entered Year is a leap year");
        }else if(year%100==0 && year%400 ==0){
            System.out.println("Entered Year is a leap year");
        }else {
            System.out.println("Entered Year is not a leap year");
        }

    }
}
