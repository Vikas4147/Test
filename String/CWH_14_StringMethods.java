package com.company.String;
// note- Strings are immutable
public class CWH_14_StringMethods {
    public static void main (String[] args){
        String name ="Vikas";
        int value = name.length();  // It will give no of characters in the string and index value starts from 0
        System.out.println(value);

        String lstring = name.toLowerCase(); // used to convrt everything into lowercase
        System.out.println(lstring);

        String ustring = name.toUpperCase(); // // used to convrt everything into uppercase
        System.out.println(ustring);

        String nonTrimmedString = "    Vikas    ";
        System.out.println(nonTrimmedString);;
        System.out.println(nonTrimmedString.trim()); // Used to remove spaces from leading and trailing end in strings

        System.out.println(name.substring(2)); // Used to print the given string from any index of string
        System.out.println(name.substring(1,4)); // starting index is included and ending index is excluded

        System.out.println(name.replace('k','s'));   // use to replace a single character or group of characters
        System.out.println(name.replace("as","jk"));
        System.out.println(name.replace("a","jkl"));

        System.out.println(name.startsWith("Vik")); // Check whether it starts with it or not
        System.out.println(name.endsWith("Vik"));

        System.out.println(name.charAt(2)); // Check the characters at given index
        System.out.println(name.indexOf("as"));

        String modifiedName = "Vikasas";
        System.out.println(modifiedName.indexOf("as"));
        System.out.println(modifiedName.indexOf("as",4));
        System.out.println(modifiedName.lastIndexOf("as"));

        System.out.println(name.equals("vikas"));
        System.out.println(name.equalsIgnoreCase("VikAS"));

        // Escape Sequence Characters - Sequence of Characters after '\'
       // System.out.println("I am escape Sequence "double quote");
       // If we want to print the above statement the program will give error because of double quote
        System.out.println("I am escape Sequence \"double quote");
        // \n- used for next line , \t - used for next tab












    }
}
