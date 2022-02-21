package com.company;
import java.util.Scanner ;

public interface CWH_Exercise1 {
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in );
        System.out.println(" Enter marks in all subject 1");
        float sub1 = sc.nextFloat ();
        System.out.println(" Enter marks in all subject 2");
        float sub2 = sc.nextFloat ();
        System.out.println(" Enter marks in all subject 3");
        float sub3 = sc.nextFloat ();
        System.out.println(" Enter marks in all subject 4");
        float sub4 = sc.nextFloat ();
        System.out.println(" Enter marks in all subject 5");
        float sub5 = sc.nextFloat ();
        float percent = (sub1 + sub2 + sub3 + sub4 + sub5)/5;
        System.out.println(" Percentage is "+percent);




    }
}
