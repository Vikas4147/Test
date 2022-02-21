package com.company.PractiseSet2;
import java.util.Scanner;

public class ComparOper {
    public static void main(String[] args){
        int a =50 ;
        System.out.println("Enter a number:");
        Scanner sc =new Scanner(System.in);
        int b = sc.nextInt();
        if(b>a){
            System.out.println("Entered number is greater than given number ");
        }else {
            System.out.println("Entered number is lesser than given number ");
        }

    }

}
