package com.company.PractiseSet5;
import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {
        System.out.println("Enter a number whose table you want to print:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Table in reverse order is");
        for(int i=10 ; i>=1 ; i--){
            System.out.println(n*i);
        }
    }
}
