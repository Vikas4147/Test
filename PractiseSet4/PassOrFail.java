package com.company.PractiseSet4;
import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in Sub1 out of 100:");
        float sub1 = sc.nextFloat();
        System.out.print("Enter your marks in Sub2 out of 100:");
        float sub2 = sc.nextFloat();
        System.out.print("Enter your marks in Sub3 out of 100:");
        float sub3 = sc.nextFloat();
        float percentage = (sub1 + sub2 +sub3)/3;
        System.out.println("Your Percentage is:"+percentage );
        if(percentage>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("You have Cleared the Exams ");
        }else{
            System.out.println("You didn't cleared the exams ");
        }





    }
}
