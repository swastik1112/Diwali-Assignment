//Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method



class Student {
 
    
   int a;
   
   static int b;
 
 Student()
 {
	 b++;
 }
 public void printData()
 {
	 System.out.println("Value of a= "+a);
	 
	 System.out.println("Value of b= "+b);
 }
   
}
class Q22
{
	public static void main(String args[])
	{
		Student s1=new Student();
		
		s1.printData();
		
		Student.b++;
		
		s1.printData();
	}
}