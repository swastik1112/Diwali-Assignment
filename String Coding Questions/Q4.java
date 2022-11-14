//How to program to print the first non repeated character from String? 


import java.util.Scanner;

public class Q4 {

  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner(System.in);
	
    System.out.println("Enter input string");
	
    String s1 = scanner.next();
	
    char characterArray[] = s1.toCharArray();
	
    for (int i = 0; i < characterArray.length; i++) {
		
      if (s1.lastIndexOf(characterArray[i]) == s1.indexOf(characterArray[i])){
		  
        System.out.println("First Non repeated character in a string " + s1 + " is " + characterArray[i]);
       
	   break;
      }
    }
  }
}