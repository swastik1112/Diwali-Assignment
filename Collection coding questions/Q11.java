//Write a Java program to display the elements and their positions in a linked list.

import java.util.LinkedList;

import java.util.Iterator;

  public class Q11 {
	  
  public static void main(String[] args) {
   
     LinkedList<String> l_list = new LinkedList<String>();
 
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
  
   System.out.println("Original linked list:" + l_list);  
   
  for(int p=0; p < l_list.size(); p++)
   {
      System.out.println("Element at index "+p+": "+l_list.get(p));
    } 
 }
}