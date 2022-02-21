package com.company.PractiseSet1;

import java.util.Scanner;

public class CWH_SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        float num1 = sc.nextFloat();
        System.out.println("Enter Number 2 ");
        float num2 = sc.nextFloat();
        System.out.println("Enter Number 3 ");
        float num3 = sc.nextFloat();
        float sum = num1 + num2 + num3;
        System.out.println("Sum of numbers is " + sum);
    }
}