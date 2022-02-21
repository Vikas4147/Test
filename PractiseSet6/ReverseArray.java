package com.company.PractiseSet6;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60};
        int [] reverse = new int[arr1.length];
        int[]temp = new int[arr1.length];
        System.out.println("Reverse of an array is ");

        for(int i=arr1.length-1;i>=0 ;i--){
            temp[arr1.length-i-1]=arr1[i];
            reverse[i]=temp[arr1.length-i-1];
            System.out.print(reverse[i] +" ");
        }

    }
}
