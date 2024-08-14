
package com.mycompany.adding.removing.usingarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingRemovingUsingArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <String> student = new ArrayList<>();
        
        student.add("Decent");
        student.add("Phila");
        student.add("Thato");
        student.add("Mosa");
        student.add("Happiness");
        
        System.out.println("ArrayLst:"+" "+student );
        String firstStudent = student.get(0);
        System.out.println("First student:"+" "+firstStudent);
       
        student.set(2, "Mildred");
        System.out.println("update ArrayList:"+" "+student);
        
        student.remove(3);
        System.out.println("After removing:"+" "+student);
        
        int size = student.size();
        System.out.println("Size of ArrayList:"+" "+size);
        
        for(String display: student){
            System.out.println(display);
        }
    }
}
