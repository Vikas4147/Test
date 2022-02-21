package com.company.PractiseSet6;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},
                        {4,5,6}};
        int[][] mat2 = {{3,4,5},
                        {6,7,8}};
        int[][] result = {{0,0,0},
                          {0,0,0}};
        System.out.println(" matrix addition is ");
        for(int i=0;i<mat1.length;i++){
            for(int j=0 ;j<mat1[i].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j] ;
                System.out.print(result[i][j] +" ");
            }
            System.out.println(" ");
        }



}}
