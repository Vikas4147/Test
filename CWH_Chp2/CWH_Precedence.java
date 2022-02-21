package com.company.CWH_Chp2;

public class CWH_Precedence {
    public static void main (String[] args){
        // In Programming BODMAS rule does not follow compulsarily.we need to check Precedence and Associativity
        //When two operators have same precedence we need to follow associativity ( Left-Right or Right-Left )
        int a = 6*5-34/2;
        // 30-34/2  ==> 30-17 ==> 13
        int b = 60/5-34*2; // Since both * and / have same precedence we will follow associativity (left-right)
        // 12-68 ==> -56
        System.out.println(a);
        System.out.println(b);
    }
}
