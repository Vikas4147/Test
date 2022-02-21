package com.company.PractiseSet4;
import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String website =sc.nextLine();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }else if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }else if(website.endsWith(".in")){
            System.out.println("This is an Indian website ");
        }else{
            System.out.println("Please enter correct extension ");
        }


    }

}
