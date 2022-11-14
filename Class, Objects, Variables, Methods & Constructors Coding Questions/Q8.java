//Java Program to Count Number of Objects Created for Class

public class Q8
{
		static int count=0;
		
		Q8()
		{
				count++;
		}
		public static void main(String args[])
		{
			Q8 obj=new Q8();
			Q8 obj1=new Q8();
			Q8 obj2=new Q8();
			Q8 obj3=new Q8();
			Q8 obj4=new Q8();
			
			System.out.println("Number of objects created: "+count);
		
		}
}