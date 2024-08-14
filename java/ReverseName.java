
package com.mycompany.reversename;

import java.util.Scanner;

public class ReverseName {
static String name;
static void reverse(){
    Scanner s = new Scanner(System.in);
    System.out.println("enter a name");
    name = s.nextLine();
    String reversed = new StringBuilder(name).reverse().toString();
    System.out.println("Reversed string: " + reversed);
}
    public static void main(String[] args) {
        reverse();
    }
}
