package com.company.PractiseSet3;
import java.util.Scanner;

public class ReplaceJavaTemplate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String st = sc.nextLine();
        System.out.println(st.replace("<name>","Vikas"));

    }
}
