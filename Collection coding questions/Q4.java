//Write a Java program to sort a given array list.


 Java Program to Sort an ArrayList
 

import java.util.*;
 
class Q4 {
 
   
    public static void main(String[] args)
    {
       
        ArrayList<String> list = new ArrayList<String>();
 
        
        list.add("India");
        list.add("Pakistan");
        list.add("Srilanka");
        list.add("USA");
        list.add("Australia");
        list.add("Japan");
 
        
        System.out.println("Before Sorting : " + list);
 
        
        Collections.sort(list);
 
     
        System.out.println("After Sorting : " + list);
    }
}