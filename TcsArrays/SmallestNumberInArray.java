package com.company.TcsArrays;
// Logic- Sort the array in ascending order hence first element will be the smallest element
public class SmallestNumberInArray {
    public static void main(String[] args) {
        int [] arr1 ={2,5,1,3,0};
        int a =arr1.length-1 ;
        int temp;
        for(int i=0;i<=arr1.length-1;i++){
            for(int j=i;j<=a;j++){        // Here we have started the second  loop with j=i because first element in the array is smallest
                if(arr1[i] > arr1[j]) {   // Similarly for second iteration also
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j]= temp;
                }
            }
        }
        for(int i=0;i<=arr1.length-1;i++){
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
       System.out.println("Smallest element in the array is "+arr1[0]);
        System.out.println("Second smallest element in array is "+arr1[1]);


    }


}
