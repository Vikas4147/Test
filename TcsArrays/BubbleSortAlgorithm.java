package com.company.TcsArrays;
// In Bubble Sort Algorithm we check two consecutive elements in each iteration and depending upon whether we want
// to arrange in ascending or descending order we put the condition

public class BubbleSortAlgorithm {  // Arranging in ascending order
    public static void main(String[] args) {
        int[]arr={5,7,3,9,8};
        int n = arr.length-1;
        int temp;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){  // After every iteration the largest element will be at the end of the the array
                                      // hence in next iteration no need to check that therefore condition is n-i
                                      // After every iteration no of elements we need to check will be  decreasing
                if(arr[j+1]<arr[j]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] =temp;

                }
            }
        }System.out.println("Array After sorting is");
        for(int i=0;i<=n;i++){
            System.out.print(" "+arr[i]);
        }
    }

}
