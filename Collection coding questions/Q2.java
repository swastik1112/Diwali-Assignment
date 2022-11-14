//Write a Java program to insert an element into the array list at the first position.


import java.util.*;

  public class Q2 {
	  
  public static void main(String[] args) {
  
  List<String> list_Strings = new ArrayList<String>();
  
  list_Strings.add("swastik");
  
  list_Strings.add("vishal");
  
  list_Strings.add("lukesh");
  
  list_Strings.add("saurabh");
  
  list_Strings.add("ashish");
 
  System.out.println(list_Strings);
 
  list_Strings.add(0, "pankaj");
  
  list_Strings.add(5, "prajwal");
  
  System.out.println(list_Strings);
 }
}
Sample Output: