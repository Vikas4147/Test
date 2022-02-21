package com.company.PractiseSet3;
import java.util.Scanner;

public class ReplaceSpaceWithUnderscore {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String st = sc.nextLine();
        System.out.println(st.replace(" ","_"));

    }
}
