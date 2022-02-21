package com.company.PractiseSet5;
import java.util.Scanner;
public class PrintTable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number whose table you want to print:");
        int n=sc.nextInt();
        for(int i=1 ; i<=10;i++){
            System.out.println(n*i);
        }

    }
}
