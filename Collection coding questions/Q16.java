//Write a Java program to empty an hash set.


import java.util.*; 
 
public class Q16 {  

    public static void main(String[] args) {  
       
            HashSet<String> hset = new HashSet<String>();  
         
            hset.add("Welcome");  
            hset.add("To");  
            hset.add("JavaTpoint");   
           
            System.out.println("HashSet Elements: "+hset);   
       
            System.out.println("Is the set empty: "+hset.isEmpty());  
           
            hset.clear();  
            System.out.println("Is the set empty: "+hset.isEmpty());  
    }  
}  