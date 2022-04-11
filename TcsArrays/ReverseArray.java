package com.company.TcsArrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int a = arr.length-1;
        int temp;
        for(int i=0;i<=(arr.length-1)/2;i++){
            if(i!=a-i){
                temp=arr[a-i];
                arr[a-i]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("Array after reversing is ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
