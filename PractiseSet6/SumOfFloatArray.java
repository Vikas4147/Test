package com.company.PractiseSet6;
import java.util.Scanner;
public class SumOfFloatArray {
    public static void main(String[] args) {
        float[] marks = {20.5f,30.4f,70.6f,40.7f,50.5f};
        float sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println("Sum of all entries is "+sum);
    }
}
