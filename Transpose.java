package com.rakuten;

public class Transpose {
  public static void main(String[] args) {
     int[][] original= {{1,2,3},{4,5,6},{7,8,9}};
     int[][] transpose= new int[3][3];
     System.out.print("Original matrix: \n");
     for (int i=0;i<original.length;i++)
     {
         for(int p=0;p<original[i].length;p++)
         {
             System.out.print(original[i][p]);
         }
         System.out.print("\n");
     }
     System.out.println("Transpose of a matrix: ");
     for (int i=0;i<original.length;i++)
     {
         for(int p=0;p<original[i].length;p++)
         {
            transpose[i][p]=original[p][i];
            System.out.print(transpose[i][p]);
         }
         System.out.print("\n");
     }
  }
}