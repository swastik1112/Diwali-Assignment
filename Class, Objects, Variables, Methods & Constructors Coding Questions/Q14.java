//java Program to Create a Method with 2 Parameters and without Return Type


import java.util.*;

public class Q14 
{

    public static void main(String args[])
	
    {
        int a = 4;
		
        int b = 5;
 
        // Calling the function with 2 parameters
		
        calc(a, b);
    }
	
    public static void calc(int x, int y)
	
    {
        int sum = x + y;
		
        System.out.print("Sum of two numbers is :" + sum);
    }
}