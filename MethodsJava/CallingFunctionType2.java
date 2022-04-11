package com.company.MethodsJava;

public class CallingFunctionType2 {
    int logic(int x ,int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args){
        int a =5 ;
        int b =7 ;
        int d;
        CallingFunctionType2 obj= new CallingFunctionType2(); // since static is not used we need to create object to call the  function
        d =obj.logic(a,b);
        System.out.println(d);
    }
}
