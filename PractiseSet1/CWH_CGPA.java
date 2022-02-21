package com.company.PractiseSet1;
import java.util.Scanner ;

public class CWH_CGPA {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks In Subject 1 ");
        float mark1= sc.nextFloat();
        System.out.println("Enter Marks In Subject 2 ");
        float mark2= sc.nextFloat();
        System.out.println("Enter Marks In Subject 3 ");
        float mark3= sc.nextFloat();
        float percent = (mark1 + mark2 + mark3)/3 ;
        double CGPA = percent/9.5;
        System.out.println(" CGPA is "+CGPA);
    }
}
