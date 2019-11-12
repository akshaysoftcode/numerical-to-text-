import java.util.*;
class Student{  
 int id;  
 String name;  
}  
class TestStudent3{  
 public static void main(String args[]){  
  //Creating objects  
 
  //Initializing objects 
 Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, id");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int id = myObj.nextInt();
    
 Scanner myObj2 = new Scanner(System.in);

    System.out.println("Enter name, id");

    // String input
    String name2 = myObj2.nextLine();

    // Numerical input
    int id2 = myObj2.nextInt();
    
  //Printing data  
  System.out.println("id of candidate:"+" " +id +"name of candidate: "+ name);  
  System.out.println("id of candidate:"+" " +id2 +"name of candidate: "+ name2);  
 }  
}