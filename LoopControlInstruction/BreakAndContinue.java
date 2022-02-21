package com.company.LoopControlInstruction;

public class BreakAndContinue {
    public static void main(String[] args) {
        // Break is used when we want to execute a code upto certain condition
        // Continue will be used when we want to skip a particular condition i.e code below continue statement inside the loop will be skipped
        for(int i=0; i<5;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Loop ends here");
                break;
            }
        }
    }
}
