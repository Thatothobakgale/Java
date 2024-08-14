
package com.mycompany.hospital_bill;

import java.util.Scanner;

public class Hospital_bill {
static String name;
static int vowel =0;
static void captureLocation(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name");
    name = s.next();
    for(char c: name.toCharArray()){
        if(c=='a'){
            vowel++;
        }
    }
        System.out.println(vowel);
    }
    public static void main(String[] args) {
        captureLocation();
    }
}
