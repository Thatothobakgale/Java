
package com.mycompany.user.details.setter.and.getter;

import java.util.Scanner;

public class UserDetailsSetterAndGetter {
static String name;
static int age;
static double amount;
public void setUserDetails(String name, int age, double amount){
    this.name = name;
    this.age = age;
    this.amount = amount;
}
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public double getAmount(){
    return amount;
}
    public static void main(String[] args) {
        UserDetailsSetterAndGetter C = new UserDetailsSetterAndGetter();
        Scanner d = new Scanner(System.in);
        System.out.println("Please enter your name.");
        name = d.next();
        System.out.println("Please enter your agee.");
        age = d.nextInt();
        System.out.println("Please enter the amount that you get.");
        amount = d.nextDouble();
        System.out.println("Your name is"+" "+C.getName()+","+"your age is"+" "+C.getAge()+" "+"and your amount is"+" "+"R"+C.getAmount());
    }
}


sum2 = initialBalance - balance;
        System.out.println("You've deposited"+" "+balance+" "+"into this account:"+" "+accountNo);
        System.out.println("The balance in the account number"+" "+account+" "+"is"+" "+"R"+sum2);
     