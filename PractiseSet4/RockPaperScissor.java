package com.company.PractiseSet4;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {                      // 0-Rock ,1-Scissor ,2-Paper
    public static void main(String[] args) {
        Random rand= new Random();
        int upperbound = 3;
        int i=0; int a =0; int b=0;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter User Input");
      for(i=0;i<5;i++){
          int random = rand.nextInt(upperbound);
            int input = sc.nextInt();
            System.out.println("Enter user input:"+input);
            System.out.println("Random input is"+random);
      if((random==0 && input ==0) || (random==1 && input ==1) || (random==2 && input ==2)){
          System.out.println("Match Tied-Please Play Again ");
      }else if ((random==0 && input==1) || (random==1 && input==2) || (random==2 && input==0)){
          System.out.println("Computer won");
          a++;
      }else if((random==0 && input==2)|| (random==1 && input==0)||(random==2 && input==1)){
          System.out.println("You won");
          b++;
      }else{
          System.out.println("Enter correct input");
      }
      }if(a==b){
            System.out.println("Match tied between you and computer");
        }else if (a>b){
            System.out.println("Computer won more number of times ");
        }else{
            System.out.println("You won more number of times ");
        }
}}

