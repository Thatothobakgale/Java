
package largestnum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LargestNum {
    static double max, min, ave, total = 0;
    static int number[] = new int[5];
static void numbers(){
    Scanner s = new Scanner(System.in);
    System.out.println("enter number.");
    for(int i =0; i<5; i++){
        number[i] = s.nextInt();
    }
    min = number[0];
    max = number[0];
    
    for(int i=0; i<5; i++){
        if(number[i] > max){
           max = number[i];
        }
        else if(number[i] < min){
            min = number[i];
        }
        total = total + number[i];
    }
    ave = total/5.0;
    System.out.println("highest number " + max);
    System.out.println("minimum number " + min);
    System.out.println("average number " + ave);
}
    public static void main(String[] args) {
       numbers();
    }
}
