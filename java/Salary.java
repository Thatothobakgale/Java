
package com.mycompany.salary;

import java.util.Scanner;

public class Salary {
static double initialsalary = 8000,finalsalary;
static int id;
static void salary(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your identity number.");
    id = s.nextInt();

   if (id %2 == 0)
   {
       System.out.println("Your identity number is an even identity.");
      finalsalary = initialsalary + 0.1;
        System.out.println("Your new salary is"+" "+finalsalary);
   }

   else
   {
       System.out.println( "sorry, your identity number is not even.");
       finalsalary = initialsalary;
       System.out.println("Your new salary is"+" "+finalsalary);
   }
}
    public static void main(String[] args) {
       salary();
    }
}
