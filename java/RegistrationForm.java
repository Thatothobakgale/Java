
package com.mycompany.registrationform;

import java.util.Scanner;

public class RegistrationForm {
static String name, surname, password, name1, surname1, password1;
static int number;
static void option(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter 1 to register");
    number = s.nextInt();
    if(number != 1){
        System.out.println("You entered wrong digit.");
        option();
    }
    else{
        register();
    }
}
static void register(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name.");
    name = s.next();
    
   System.out.println("Enter your surname.");
   surname = s.next();
   
    System.out.println("Enter your password.");
    password = s.next();
    
    System.out.println("Your account has been registered.");
    
    System.out.println("Enter 1 to login.");
    System.out.println("Enter 2 to re-register.");
    System.out.println("Enter 3 to log out.");
    number = s.nextInt();
    
    if(number == 1){
        login();
    }
    else if (number == 2){
        reRegister();
    }
    else if(number == 3){
        System.out.println("You have logged out.");
    }
    else{
        System.out.println("Invalid input");
        register();
    }
    System.exit(0);
}
static void login(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name.");
    name1 = s.next();
    
   System.out.println("Enter your surname.");
   surname1 = s.next();
   
    System.out.println("Enter your password.");
    password1 = s.next();
    
    if(name.equals(name1) && surname.equals(surname1) && password.equals(password1)){
        System.out.println("Logged in successfully");
    }
    else{
        System.out.println("Wrong details.");
        login();
    }
    System.exit(0);
}

static void reRegister(){
      Scanner s = new Scanner(System.in);
    System.out.println("Enter your name.");
    name = s.next();
    
   System.out.println("Enter your surname.");
   surname = s.next();
   
    System.out.println("Enter your password.");
    password = s.next();
    
    System.out.println("Your account has successfully re-registered.");
}
    public static void main(String[] args) {
    option();
    register();
    login();
    reRegister();
    }
}
