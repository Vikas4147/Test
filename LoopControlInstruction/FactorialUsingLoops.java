package com.company.LoopControlInstruction;
import java.util.Scanner;

public class FactorialUsingLoops {
    public static void main(String[] args) {
        System.out.println("Enter a Number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial = 1;
        for( int i=n;i>=2;i--){
            factorial*=i;
        }
        System.out.println("Factorial is "+factorial);
    }


}
