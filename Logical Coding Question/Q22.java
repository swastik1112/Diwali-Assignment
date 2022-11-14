public class Q22 
{  
		public static void main(String[] args)   
		{  
			int rows=7;  
			for (int i = 1; i <= rows; i++)   
			{  
				for (int j = 1; j <= rows-i; j++)  
				{  
					System.out.print(1);  
				}  
				for (int j = 1; j <= i; j++)  
				{  
					System.out.print(i);  
				}  
					System.out.println();  
				 
			}  
		}  
		
}


/*

E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q22.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q22
1111111
1111122
1111333
1114444
1155555
1666666
7777777

*/