
package com.mycompany.operator;

import java.util.Scanner;

public class Operator {
static float sum, num1, num2;
static String operator;
static void captureNumber(){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Choose operator: +, -, /, *");
    operator = s.next();
    System.out.println("Enter the first number");
    num1 = s.nextFloat();
    
    System.out.println("Enter the second number");
    num2 = s.nextFloat();
    
    if(operator.equalsIgnoreCase("+"))
    {
        sum = num1 + num2;
        
        System.out.println("The sum is"+ " "+sum);
    }
    else if(operator.equalsIgnoreCase("-"))
    {
        sum = num1 - num2;
        
        System.out.println("The sum is"+ " "+sum);
    }
    else if(operator.equalsIgnoreCase("*"))
    {
        sum = num1 * num2;
        
        System.out.println("The sum is"+ " "+sum);
    }
    else if(operator.equalsIgnoreCase("/"))
    {
        sum = num1 / num2;
        
        System.out.println("The sum is"+ " "+sum);
    }
    else
    {
        System.out.println("Unknown operator.");
    }
}
    public static void main(String[] args) {
       captureNumber();
    }
}
