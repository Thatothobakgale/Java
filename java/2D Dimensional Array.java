
package com.mycompany.x2dimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    
    public static void main(String[] args) {
        int[][] myArray = new int[3][2];
       Scanner s = new Scanner(System.in);
        System.out.println("Enter 6 integers to populate the 3x2 array:");
        for(int row=0; row<3; row++){
            for(int col=0; col<2; col++){
                System.out.println("Enter an integer for row " + (row + 1) + ", column " + (col + 1) + ": ");
                myArray[row][col] = s.nextInt();
          }
        }
        System.out.println("The populated array is: ");
        for(int row=0; row < 3; row++){
            for(int col = 0; col <2; col++){
                System.out.println(myArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}
