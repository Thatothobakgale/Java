
package com.mycompany.carsystem;

import java.util.Scanner;

public class CarSystem {
static String answer;
static int start;
static float brake, accelerate, actualSpeed = 60, currentSpeed;

static void start(){
    Scanner s = new Scanner (System.in);
    System.out.println("Enter 1 to start the car.");
    start = s.nextInt();
    if (start != 1)
    {
        start();
    }
    else if (start == 1)
    {
        System.out.println("The car is moving at "+ " "+actualSpeed+ "km/h");
    }
}

static void selectOption(){
    Scanner s = new Scanner (System.in);
    System.out.println("Do you want to accelerate or brake?");
    answer = s.next();
    
    if(answer.equalsIgnoreCase("accelerate"))
    {
        System.out.println("How many seconds are you holding the acceletor padel for?");
        accelerate = s.nextFloat();
    }
    else if(answer.equalsIgnoreCase("Brake"))
    {
         System.out.println("How many seconds are you holding the brake padel for?");
        brake = s.nextFloat();
    }

    currentSpeed = (actualSpeed + accelerate) - brake;
    if(currentSpeed >0)
    {
        selectOption();
    }
    else
    {
    System.out.println("The car has stopped");
    }
}
    public static void main(String[] args) {
        start();
        selectOption();  
    }
}
