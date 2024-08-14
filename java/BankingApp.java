
package com.mycompany.bankingapp;
import java.time.LocalDateTime;
import java.util.Scanner;
public class BankingApp {
static String accountNo, name, surname, name1, answer, pin, pin1, pin2, address, ID, email, email1 = "@gmail.com";
static int  account = 29087564, number;
static double  initialBalance = 0.00, balance, balance2, balance3, sum, sum2, rent, product;
    
static void option(){
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to African Bank banking system.");
    System.out.println("Enter 1 to Login or 2 to Register.");
    number = s.nextInt();
    switch(number){
        case 1:
            login();
            break;
        case 2:
            register();
            break;
        default:
            System.out.println("Invaild");
            option();
            break;
    }
}
static void choice(){
    Scanner s = new Scanner(System.in);
     System.out.println("Enter 1 to deposit, or 2 to withdraw money or 3 to transfer, or 4 to check balance or");
     System.out.println("5 to get your bank Statement or 6 to change your pin or 7 for payment or 8 to exit.");
    number = s.nextInt();
   
    if(number == 1){
        deposit();
    }
    else if (number == 2){
       withdraw();
        }
    else if(number== 3){
       transfer();
    }
    else if(number==4){
        balance();
    }
    else if(number == 5){
        System.out.println("This is your bank statement.");
        bankStatement();
    }
    else if(number == 6){
        System.out.println("You are about to reset your pin. Enter 1 to proceed");
        number = s.nextInt();
        while(number == 1){
            System.out.println("Please enter your new pin. (max 5 digits)");
    pin2 = s.next();
    if(pin2.length() < 5){
        System.out.println("Pin is too short");
        register();
    }
    else if(pin2.length() > 5){
        System.out.println("Pin is too long");
        register();
    }
            if(pin2.equals(pin)){
                System.out.println("Your new pin is the same as the previous pin");
            }
            else{
                System.out.println("Your pin has been changed to " + pin2);
                choice();
            }
        }
    }
    else if(number == 7){
         payment();
    }
    else if(number == 8){
        System.out.println("You've exited the system. Thank you for using our banking system " + name);
        System.exit(0);
    }
    else{
        choice();
    } 
    System.exit(0);
}
static void login(){
    Scanner s = new Scanner(System.in);
    System.out.println("\nYou are logging in an African Banking system.");
    System.out.println("Please enter your pin to log in.");
    pin = s.next();
    if(pin.equals(pin1)){
        System.out.println("\nYou have succesfully logged in.");
        System.out.println("You have"+" "+"R"+initialBalance+" "+"in your account.");
        choice();
        }
    else{
        System.out.println("\nYou don't have an account. Please register.");
        System.out.println("Enter 1 to register or 2 to log out.");
        number = s.nextInt();
        if(number == 1){
            register();
        }
        else if(number ==2 ){
            System.out.println("You have successfully logged out.");
        }
        System.exit(0);
      }
    }
static void register(){
            Scanner s = new Scanner(System.in);
            System.out.println("You are about to open an African Bank account. Enter 1 to procced.");
            number = s.nextInt();
    if(number == 1){
            System.out.println("Enter your name.");
            name = s.next();
            System.out.println("Enter your surname.");
            surname = s.next();
            System.out.println("Enter your ID number.(max 13 digits)");
            ID = s.next();
            if(ID.length() < 13){
        System.out.println("ID number is too short");
        register();
    }
    else if(ID.length() > 13){
        System.out.println("ID number is too long");
        register();
    }
    System.out.println("Enter your email address.");
    email = s.next();
    System.out.println("Enter your address.");
    address = s.next();
    System.out.println("Please enter your pin. (max 5 digits)");
    pin1 = s.next();
    if(pin1.length() < 5){
        System.out.println("Pin is too short");
        register();
    }
    else if(pin1.length() > 5){
        System.out.println("Pin is too long");
        register();
    }
    else{
        System.out.println("Your pin is " + pin1);
    }
            if(email.contains(email1)){
            System.out.println("\nYou have opened an African Bank account.\n");
            System.out.println("Account holder's name:"+" "+name);
            System.out.println("Account holder's surname:"+" "+surname);
            System.out.println("Account holder's ID number:"+" "+ID);
            System.out.println("Account holder's address:"+" "+address);
            System.out.println("Account holder's email address:"+" "+email);
            System.out.println("Account holder's account number:"+" "+account);
            System.out.println("Account holder's pin:"+" "+pin1);
            System.out.println("Account holder's initial balance:"+" "+"R"+initialBalance);

            login();
            }
            else{
                System.out.println("You entered wrong email. Please try again.");
                register();
            }
        }
    else{
            System.out.println("Invalid number. Please try again.");
            register();
        }
}
static double deposit(){
    Scanner s = new Scanner(System.in);
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("You chose the deposit option");
    System.out.println("How much do you want to deposit?");
    balance2 = s.nextDouble();
    balance += balance2;
    System.out.println("Choose the deposit method (cash, bank-transfer, online-payment)");
    answer = s.next();
    System.out.println("You've deposited"+" "+"R"+balance2+" "+"into this account:"+" "+account+" "+"at"+" "+currentDateTime);
    System.out.println("The balance in the account number"+" "+account+" "+"is"+" "+"R"+balance);
    System.out.println("Enter 1 to get proof of payment or 2 if you don't want it.");
    number = s.nextInt();
    if(number ==1){
    System.out.println("************************************************");
    System.out.println("Here is your proof of payment.\n");
    System.out.println(currentDateTime);
    System.out.println("You deposited " + " R"+balance + " into the accout number " + account + " at " + currentDateTime);
    System.out.println("Deposit reference number: 2135046");
    System.out.println("Payment method: " + answer);
    System.out.println("Payment reference number: " + ID);
    System.out.println("Payee's name: " + name);
    System.out.println("Payee's address: " + address);
    System.out.println("This receipt confirms that the deposit has been made to the account number: " + account);
    System.out.println("**********************************************************************************");
    choice();
    }
    else if(number ==2){
        choice();
    }
    else {
        System.out.println("You've entered wrong digit. Please try again");
        deposit();
    }
    return balance;
}
static double withdraw(){
    Scanner s = new Scanner(System.in);
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("You chose the withdrawal option");
    System.out.println("How much do you want to withdraw?");
    sum2 = s.nextDouble();
    
        if(sum2> balance){
            System.out.println("Insufficient fund.");
          }
        else{
            balance -=  sum2;
            System.out.println("You withdrawn"+" "+"R"+sum2+" "+"at"+" "+currentDateTime);
            System.out.println("The new balance is"+" "+"R"+balance);
        
        System.out.println("Enter 1 to get proof of withdrawal or 2 if you don't want it.");
        number = s.nextInt();
        if(number ==1){
        System.out.println("************************************************");
        System.out.println("Here is your proof of payment.\n");
        System.out.println(currentDateTime);
        System.out.println("You withdrawn " + " R"+sum2 + " from3 the accout number " + account + " at " + currentDateTime);
        System.out.println("Wthdrawal reference number: 7894568");
        System.out.println("Payment reference number: " + ID);
        System.out.println("Payee's name: " + name);
        System.out.println("Payee's address: " + address);
        System.out.println("This receipt confirms that the money has been withdrawn from the account number: " + account);
        System.out.println("****************************************************************************************");
        choice();
        }
        
    else if(number ==2){
        choice();
    }
    else {
        System.out.println("You've entered wrong digit. Please try again");
        withdraw();
    }
        }
        choice();
            return balance;
}

static double transfer(){
    Scanner s = new Scanner(System.in);
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("You are transfering money.");
    System.out.println("Enter recipient's name");
    name1 = s.next();
    System.out.println("Enter recipient's account number");
    accountNo = s.next();
    System.out.println("Choose the transfer method: (bank-transfer or online-payment)");
    answer = s.next();
    System.out.println("How much do you want to transfer?");
    balance3 = s.nextDouble();
        if(balance3 < balance){
            balance -= balance3;
        System.out.println("You've transfered"+" "+"R"+balance3+" "+"into this account number:"+" "+accountNo+" "+"at"+" "+currentDateTime);
        System.out.println("The new balance in the account number"+" "+account+" "+"is"+" "+"R"+balance);
       
            System.out.println("Enter 1 to get proof of payment or 2 if you don't want it.");
            number = s.nextInt();
            if(number ==1){
            System.out.println("************************************************");
            System.out.println("Here is your proof of payment.\n");
            System.out.println(currentDateTime);
            System.out.println("You you transferred " + " R"+balance3 + " into the accout number " + account + " at " + currentDateTime);
            System.out.println("Transfer reference number: 10397564");
            System.out.println("Sender's account name and account number: " + name +", "+ account);
            System.out.println("Recipient's account name and account number: " + name1 +", "+ accountNo);
            System.out.println("Transfer method: " + answer);
            System.out.println("Payment reference number: " + ID);
            System.out.println("Payee's address: " + address);
            System.out.println("This receipt confirms that the transfer has been debited from the account number: " + account + " and ");
            System.out.println("credited to the account number: " + accountNo);
            System.out.println("*****************************************************************************");
            choice();
        }
        
        else if(number ==2){
            choice();
        }
            else {
            System.out.println("You've entered wrong digit. Please try again");
            transfer();
        }
        } 
        else{
             System.out.println("Your current balance is not enough to transfer.");
             choice();
        }
        
        
   choice();
   return balance;  
}

static double payment(){
    Scanner s = new Scanner (System.in);
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("What would you like to pay for, rent (1) or product (2)?");
    number = s.nextInt();
    if(number==1){
        System.out.println("How much are you paying for your rent?");
        rent = s.nextDouble();
        if(rent> balance){
            System.out.println("Insufficient funds");
            payment();
        }
        else{
             balance = balance - rent;
             System.out.println("You paid rent for R" + rent + " at " + currentDateTime);
             System.out.println("Your new balance is " + balance);
        }
    }
    else if(number==2){
        System.out.println("How much are you paying for your product?");
        product = s.nextDouble();
        if(product> balance){
            System.out.println("Insufficient funds");
            payment();
        }
        else{
             balance = balance - product;
             System.out.println("You paid rent for R" + product + " at " + currentDateTime);
             System.out.println("Your new balance is " + balance);
        }
    }
            System.out.println("Did you pay for rent or product?");
            answer = s.next();
            System.out.println("Enter 1 to get proof of payment or 2 if you don't want it.");
            number = s.nextInt();
            if(number ==1){
            System.out.println("************************************************");
            System.out.println("Here is your proof of payment.\n");
            System.out.println(currentDateTime);
            System.out.println("You paid R" +balance +" for "+ answer + " at " + currentDateTime);
            System.out.println("Payment reference number: 597310");
            System.out.println("Payment method: " + answer);
            System.out.println("Payment reference number: " + ID);
            System.out.println("Payee's name: " + name);
            System.out.println("Payee's address: " + address);
            System.out.println("This receipt confirms that the payment for " + answer + " has been made " + "at " + currentDateTime);
            System.out.println("*****************************************************************************");
            choice();
        }
        else if(number ==2){
            choice();
        }
        else {
            System.out.println("You've entered wrong digit. Please try again");
            payment();
        }
    choice();   
    return balance;
}
static double balance(){
    sum += balance;
    System.out.println("Your balance is " + " R"+ sum);
    choice();
    return sum;
    
}
static void bankStatement(){
    Scanner s = new Scanner(System.in);
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("**********************************************");
    System.out.println("\nAccount holder's name:"+" "+name + " "+ surname);
    System.out.println("Account holder's ID number:"+" "+ID);
    System.out.println("Account holder's address:"+" "+address);
    System.out.println("Account holder's account number:"+" "+account);
    System.out.println("Account holder's balance:"+" "+"R"+balance);
    System.out.println("\nYou deposited"+" "+balance2+" "+"into"+" "+account+" "+"account number."+" "+"at"+" "+currentDateTime);
    System.out.println("You withdrawn"+" "+sum2+" "+"from"+" "+account+" "+"account number."+" "+"at"+" "+currentDateTime);
    System.out.println("You transfered"+" "+balance3+" "+"from"+" "+account+" "+"to"+" "+accountNo+" "+"at"+" "+currentDateTime);
    System.out.println("*******************************************************************");
    System.out.println("Current balance: R" + balance);
    choice();
}
    public static void main(String[] args) {
        option();
        bankStatement();
    }
}
