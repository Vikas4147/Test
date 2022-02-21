package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main (String[] args) {
       // System.out.println("Taking Input From The User");
      Scanner sc = new Scanner(System.in);
       // System.out.println("Enter number 1");
      //  int a = sc.nextInt();
        //float a = sc.nextFloat();
        //System.out.println("Enter number 2");
       // int b = sc.nextInt();
        //float b = sc.nextFloat();
       // int sum = a+b;
        //float sum = a+b;
        //System.out.println("The Sum Of these numbers is "+ sum);
        boolean b1 = sc.hasNextInt(); // It is used to validate whether input asked from user matches with desired value or not
        System.out.println(b1);
    }
}
