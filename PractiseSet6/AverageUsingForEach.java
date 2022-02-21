package com.company.PractiseSet6;

public class AverageUsingForEach {
    public static void main(String[] args) {
        int  [] marks={12,13,15,17,23};
        int sum = 0;
        float average ;
        for(float element : marks){
            sum+= element;
        }
        average = sum/5;
        System.out.println("Average of entries is "+average );
    }
}
