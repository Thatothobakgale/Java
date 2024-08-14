
package com.mycompany.vouwelcount;

import java.util.Scanner;

public class VouwelCount {
static int vowelCount = 0;
static String name;
static int countVowels(){
       Scanner s = new Scanner(System.in);
   System.out.println("Enter your name");
        name = s.next();
    for(char c : name.toCharArray()){
        if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' || c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U'){
            vowelCount++;
        }
    }
    System.out.println("The number of vowels in " + name + " is " + vowelCount);
    return vowelCount;
}
    public static void main(String[] args) {
        countVowels();
    }
}
