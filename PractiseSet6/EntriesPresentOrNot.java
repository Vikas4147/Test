package com.company.PractiseSet6;
import java.util.Scanner;

public class EntriesPresentOrNot {
    public static void main(String[] args) {
        int[] marks ={10,20,30,40,50};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean present = false;
        for(int i=0 ;i<marks.length;i++){
            if(n==marks[i]){
                present = true;
                break;}
        }if(present){
            System.out.println("Number is present in the array");
        }else {
            System.out.println("Number is not present in the array ");
        }

    }
}
