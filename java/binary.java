import java.util.Arrays;
import java.util.Scanner;

public class binary {
    static int num, remainder;
    static int binary[] = new int[8];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        num = s.nextInt();
        if(num < 0 || num > 255){
            System.out.println("Wrong number");
        }
        else{
           for(int i=0; i<8; i++){
            num = num/2;
            remainder = num % 2;
            binary[i] = remainder;
           }
           System.out.println(Arrays.toString(binary));
        }
    }
}