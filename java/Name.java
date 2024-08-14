
package com.mycompany.name;

import java.util.Scanner;

public class Name {
static String name;
static int number;
static void captureDetails(){
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter your name.");
    name = s.next();
    
    System.out.println("How many times do you want your name to be displayed?");
    number = s.nextInt();
    
    for(int i=1; i<=number; i++){
        System.out.println(name);
    }
}
    public static void main(String[] args) {
       captureDetails();
    }
}
