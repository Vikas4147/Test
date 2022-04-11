package com.company.TcsArrays;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int [] arr={5,2,8,3,4,8,1,5};
        int []visited_arr = new int[arr.length];
        int visited =-1;
        for(int i=0;i<arr.length;i++){
            int count =1;
            for(int j =i+1;j<arr.length;j++){
                if (arr[i]== arr[j]){
                    count++;
                    visited_arr[j]=visited;
                }
            }
            if(visited_arr[i]!=visited){
                visited_arr[i]=count;
            }
        }
        for(int i=0;i<visited_arr.length;i++){
            if(visited_arr[i]!=visited){
                System.out.println("Frequency of "+arr[i]+":"+visited_arr[i]);
            }
        }
    }
}
