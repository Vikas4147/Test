package com.company.TcsArrays;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 8, 10};
        int a = arr.length - 1;
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j <= a; j++) {  // Here we have started the second  loop with j=i because first element in the array is largest
                if (arr[i] < arr[j]) {      // and we dont want to check it again similarly for second iteration also
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<=a;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("Largest element in the array is "+arr[0]);
    }


}
