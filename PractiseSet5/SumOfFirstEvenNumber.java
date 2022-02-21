package com.company.PractiseSet5;
import java.util.Scanner;
public class SumOfFirstEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of even numbers:");
        int n =sc.nextInt();
        int sum =0;
        int i=0;
        while(i<=n){  // can be printed simply using the formula n*(n+1)
            sum= sum +2*i;
            i++;
        }
        System.out.println("Sum of even numbers is" +sum);

    }
}
