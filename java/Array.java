
package com.mycompany.array;

import java.util.Scanner;

public class Array {
    
    static String name [] = new String[3];
    static int age [] = new int [3];
    static int number [] = new int[3];
    static void captureDetails(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 names.");
        for(int i=0; i<3; i++){
            name[i] = s.nextLine();
        }
        System.out.println("Enter 3 ages.");
        for(int d=0; d<3; d++){
            age[d] = s.nextInt();
        }
        System.out.println("Enter 3 numbers.");
        for(int t=0; t<3; t++){
            number[t] = s.nextInt();
        }
        System.out.print(Arrays.toString(name)+" ");
        System.out.print(Arrays.toString(age)+" ");
        System.out.print(Arrays.toString(number)+" ");
}
    public static void main(String[] args) {
        captureDetails();
    }
}
