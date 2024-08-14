
package adding.removing.using.hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddingRemovingUsingHashmaps {
 static Map <String, Integer> student = new HashMap<>();
       static void initializeStudents(){
       student.put("Decent", 19);
       student.put("Zethu", 20);
       student.put("Phila", 05);
       student.put("Kat", 22);
       student.put("Thato", 21);
       student.put("Philasande", 06);
       student.put("Kellogs", 20);
       student.put("Mosa", 05);
       student.put("Lethabo", 19);
       student.put("Happiness", 22);
      }
      static void createStudent(){
          Scanner s = new Scanner(System.in);
          System.out.println("Enter student name");
          String name = s.nextLine();
          System.out.println("Enter student age");
          int age = s.nextInt();
          s.nextLine();
          
          student.put(name, age);
          System.out.println("Student added successfully");
        }
      static void readStudent(){
          Scanner s = new Scanner(System.in);
          System.out.println("1. Get a student");
          System.out.println("2. Get all students");
          System.out.println("Enter your choice");
          int choice = s.nextInt();
          
          switch(choice){
              case 1:
                  System.out.println("Enter student name");
                  String name = s.next();
                  if(student.containsKey(name)){
                      System.out.println(name + ": " + student.get(name));
                  }
                  else{
                      System.out.println("Student not found.");
                  }
              case 2:
                  if(student.isEmpty()){
                      System.out.println("No student in the database");
                  }
                  else{
                   System.out.println("Student list");
                      for(Map.Entry<String, Integer> entry : student.entrySet()){
                          System.out.println(entry.getKey() + ": " + entry.getValue());
                      }
                  }
                  break;
              default:
                  System.out.println("Invalid choice");
          }
      }
      static void updateStudent(){
          Scanner s = new Scanner(System.in);
          System.out.println("You are now updating a student");
          System.out.println("Enter student name");
          String name = s.next();
          
          if(student.containsKey(name)){
              System.out.println("Enter new age");
              int age = s.nextInt();
              s.nextLine();
              student.put(name, age);
              System.out.println(name +": "+ age);
              System.out.println("Student updated successfully.");
          }
          else{
              System.out.println("Student not found");
          }
      }
      static void deleteStudent(){
          Scanner s = new Scanner(System.in);
          System.out.println("You are now deleting a student");
          System.out.println("Enter student name");
          String name = s.next();
          if(student.containsKey(name)){
              student.remove(name);
              System.out.println("Student removed successfully");
          }
          else{
              System.out.println("Student not found.");
          }
      }
      
    public static void main(String[] args) {
      initializeStudents();
      Scanner s = new Scanner(System.in);
      while(true){
          System.out.println("1. Create a student.");
          System.out.println("2. Read students.");
          System.out.println("3. Update student.");
          System.out.println("4. Delete student.");
          System.out.println("5. Exit");
          System.out.println("Enter your choice");
          int choice = s.nextInt();
          switch(choice){
              case 1:
                  createStudent();
                  break;
              case 2:
                  readStudent();
                  break;
              case 3:
                  updateStudent();
                  break;
              case 4:
                  deleteStudent();
                  break;
              case 5:
                  System.out.println("Goodbye");
                  System.exit(0);
              default:
                  System.out.println("Invalid choice please try again");
          }
      }
    }
}
