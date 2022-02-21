package com.company.PractiseSet1;
import java.util.Scanner;

public class CWH_IntegerVerification {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        float num = sc.nextFloat();
         float  num1 = (int) num;
        float result = (num - num1);
        if( result==0){
            System.out.println("Entered number is an integer ");
        }else
            System.out.println("Entered number is not an integer ");

    }
}
