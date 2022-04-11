package com.company.MethodsJava;

public class CallingFunctionType1 {
    static int logic(int x , int y){ // this is used to call the function .In this it depends whether we want to pass arguments or not
        int z ;
        if(x>y){  // if we dont use the word static then we need to create an object to call the function
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;          // In case of primitive data type when arguments are passed copy of value is stored
        int c;            // Hence in changing the value of x and y in method it won't change the value of a and b in main method
        c = logic(a,b);
        int a1=7;
        int b1=5;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
