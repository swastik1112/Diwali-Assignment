//Java Program to Create a Method without Parameters and Return Type

import java.util.Scanner;

public class Q13
{
		void areacircle()
		{
		System.out.println("Enter the radius: ");
		
		Scanner sc=new Scanner(System.in);
		
		float r=sc.nextFloat();
		
		float ar;
		
		ar=(r*r)*22/7;
		
		System.out.println("Area of the circle is : " +ar);
		}
		public static void main(String args[])
		{
				Q12 obj=new Q12();
				
				obj.areacircle();
		}
}