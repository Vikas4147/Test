package com.company.TcsArrays;


public class SumAndAverageOfArray {
    public static void main(String[] args) {
        int []arr={1,5,3,9,7,8};
        int sum=0;
        double  a=arr.length;
        double  avg;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg= sum/a;
        System.out.println("Sum is:"+sum+" and Average is:"+avg);


    }
}
