package com.company.Constructors;
// Constructors are nothing but a class in which name of class and method inside class are same
// It must be noted that when we make methods inside class we need to use dot operator to pass arguements
// But in case of constructors we can pass set of arguements f=directlu without using arguements
// Also when we are using constructors we dont need to mention the return data type in method

class Employee {
    public  Employee(String MyName,int i ){
      int id=i;
      String name=MyName;
        System.out.println("Employee name is:"+MyName );
        System.out.println("Employee id is"+id );
    }
}
public class UsingConstructors {
    public static void main(String[] args) {
        Employee vikas=new Employee("CodeWithVikas",5);


    }
}
