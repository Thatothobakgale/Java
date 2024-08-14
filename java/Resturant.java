
package com.mycompany.resturant;

import java.util.Scanner;

public class Resturant {
static double donut = 1.00, sandwhich = 3.50, bagel = 2.50, burrito = 3.50, total, total2, total3, total4;

static String answerType;
static void welcome(){
    System.out.println("Welcome to Decent's Cafe");
    System.out.println("\nEnter a y (yes) or n (no) for every question asked.");
}

static double option(){
    Scanner s = new Scanner (System.in);
    System.out.println("\nWould you like to buy donut for $1.00?");
    answerType = s.next();
    
     if (answerType.equalsIgnoreCase("y"))
          {
              total = donut;
              System.out.println("A donut has been added to your order. Your total is" +" " + total);
             
          }
           else if (answerType.equalsIgnoreCase("n"))
           {
               System.out.println("Your total is " +" "+ total);
               
           }
      else
           {
               System.out.println("Wrong answer");
           }


     System.out.println( "\nWould you like to buy sandwhich for $3.50?:");      
    answerType = s.next();
           
          if (answerType.equalsIgnoreCase("y"))
          {
              total3 = total + sandwhich;
              System.out.println("A sandwhich has been added to your order. Your total is" + " "+ total3);
          }
           else if (answerType.equalsIgnoreCase("n"))
           {
                
               System.out.println("Your total is" + " "+total);
           }
          else
           {
               System.out.println("Wrong answer");
           }
          
            System.out.println( "\nWould you like to buy bagel for $2.50?:");      
            answerType = s.next();
           
          if (answerType.equalsIgnoreCase("y"))
          {
              total2 = total + total3 + bagel;
              System.out.println("A bagel has been added to your order. Your total is" + " "+ total2);
          }
           else if (answerType.equalsIgnoreCase("n"))
           {
                
               System.out.println("Your total is" + " "+total3 + total);
           }
          else
           {
               System.out.println("Wrong answer");
           }
          
          System.out.println( "\nWould you like to buy burrito for 3.50?:");      
            answerType = s.next();
           
          if (answerType.equalsIgnoreCase("y"))
          {
              total4 = total + total3 + total2 + burrito;
              System.out.println("A burrito has been added to your order. Your total is" + " "+ total4);
          }
           else if (answerType.equalsIgnoreCase("n"))
           {
                
               System.out.println("Your total is" + " "+total3 + total2 + total);
           }
          else
           {
               System.out.println("Wrong answer");
           }
         System.out.println("\nThank you for visiting Decent's cafe...Enjoy your meal!!!");

    return 0;
  
}
    public static void main(String[] args) {
        welcome();
        option();
    }
}

