package com.company.PractiseSet3;
import java.util.Scanner;

public class DetectDoubleAndTrippleSpaces {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with Double and Tripple Spaces ");
        String st = sc.nextLine();
        System.out.println("Index of Double Spaces is: "+st.indexOf("  "));
        System.out.print("Index of Tripple Spaces is: "+st.indexOf("   "));



    }
}
