package com.company.MethodsJava;   // we will use void when we don't want to return anything

public class MethodsOverloading {
    // In case of non primitive data type reference is passed in the method hence the changes in reference will cause
    // the change in non primitive data in the main function as well but in case of primitive data type the value is passed
    // in the method hence changes made in method does not make any changes in the main function
    // i.e Call by reference and call by value respectively

    static void change (int[] arr){
        arr[0] = 98;
    }
    public static void main(String[] args){
        int [] marks ={10,50,78,58,20};
        change(marks);
        System.out.println("The value of x after running is "+marks[0]);
    }
  // Two or more methods can have same name but different parameters - Method Overloading
    // Note - Method overloading cannot be changed by changine the data type of the methods



}
