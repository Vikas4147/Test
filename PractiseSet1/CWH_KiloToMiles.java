package com.company.PractiseSet1;
import java.util.Scanner;

public class CWH_KiloToMiles {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers :");
        float kilometers = sc.nextFloat();
        double miles = 0.621371*kilometers;
        System.out.println("Conversion in miles is "+miles);
    }
}
