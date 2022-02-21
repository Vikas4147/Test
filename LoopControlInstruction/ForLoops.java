package com.company.LoopControlInstruction;
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        System.out.println("Enter number of odd numbers you want to print:");
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Odd numbers are");
        for(i=0;i<n;i++){   // It should be used when we know how many times we want to print
            System.out.println(2*i+1);
        }

    }

}
