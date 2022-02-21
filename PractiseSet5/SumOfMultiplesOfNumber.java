package com.company.PractiseSet5;
import java.util.Scanner;

public class SumOfMultiplesOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number whose sum of multiples is to be evalauated:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum +=n*i;
        }
        System.out.println("Value of Sum is"+sum);
    }
}
