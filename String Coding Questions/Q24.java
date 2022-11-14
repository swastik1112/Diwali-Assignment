/*Write a Program to sort String on their length in Java? Your method should accept an 
array of String and return a sorted array based upon the length of String. Don't forget to 
write unit tests for your solution*/

import java.util.Arrays;  

public class Q24  
{  
public static void main(String args[])   
{  

String[] countries = {"Swastik", "vishal", "Lukesh", "Sourabh", "Pankaj", " Australia", "Denmark", "France", "Netherlands", "Italy"};  
int size = countries.length;  
 
for(int i = 0; i<size-1; i++)   
{  
for (int j = i+1; j<countries.length; j++)   
{  

if(countries[i].compareTo(countries[j])>0)   
{  

String temp = countries[i];  
countries[i] = countries[j];  
countries[j] = temp;  
}  
}  
}  
 
System.out.println(Arrays.toString(countries));  
}  
}  