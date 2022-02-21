package com.company.LoopControlInstruction;

public class DoWhileLoops {
    public static void main(String[] args) {
        System.out.println("Using Do While Loops ");
        int i=0;
        do{    // should be used when we need to check that loop runs atleast once
            System.out.println(i);
            i++;
        }while(i<=10);

    }
}
