package com.company.PractiseSet6;

public class MinimumElement {
    public static void main(String[] args) {
    int [] arr = {10,3,50,7,6};
    int a = arr.length-1;
    for(int i=0 ;i<arr.length-1; i++){
        if(arr[i]> arr[a]){
            continue ;
        }else if(i-a ==1 || i-a==-1){
            System.out.println("Minimum element in array is  "+arr[i]);
        }else{
            a--;
            i--;
        }

    }


}

}
