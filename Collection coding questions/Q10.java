//Write a Java program to insert elements into the linked list at the first and last position


import java.util.*;

public class Q10 {
	
   public static void main(String args[]){
	   
      LinkedList<String> input_list = new LinkedList<String>();
	  
      input_list.add("Java");
	  
      input_list.add("Scalaa");
      
	  input_list.add("C++");
	  
      System.out.println("The list is defined as: " + input_list);
	  
      input_list.addFirst("JVA");
	  
      input_list.addLast("Spark");
	  
      System.out.println("The list after adding elements is: " + input_list);
   }
}