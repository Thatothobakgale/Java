
package com.mycompany.convetor;

import java.util.Scanner;

public class Convetor {

    static double USdollar, sum, sum2;
    static void captureAmount(){
      Scanner decent = new Scanner(System.in);    
        System.out.println("1$ equals R15");
        System.out.println("Enter the US dollar;");
        USdollar = decent.nextDouble();               
    }
    static double calSum(){
     sum = USdollar * 15;
     System.out.println("The converted amount is" + " " + sum);

     sum2  = sum + (sum * 0.07);
     System.out.println("The final converted amount is" + " " + sum2);            
    }
    public static void main(String[] args) {
        captureAmount();
        calSum();
    }
}
