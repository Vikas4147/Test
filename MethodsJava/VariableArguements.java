package com.company.MethodsJava;

public class VariableArguements {
    // This is used to avoid method overloading
    static int sum(int ...arr){
        int result =0;
        for(int a:arr){
            result+=a;
        }
        return result;

    }
    public static void main(String[] args){     // If we dont pass any arguements the in sum it will return 0 as zero is stored in result
        System.out.println("Welcome to varags tutorials ");
        System.out.println("The sum of 4 and 5 is "+sum(4,5));
        System.out.println("The sum of 4 ,5,6 is "+sum(4,5,6));
    }
}
// If we want to pass atleast one arguement in the method then we can add one compulsory parameter in that
// static int sum (int x ,int .... args)