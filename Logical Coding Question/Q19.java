public class Q19 
{  
		public static void main(String[] args)   
		{  
			int i, j, rows=7;  
			for (i = 1; i <= rows; i++)   
			{  
 
				for (j = 1; j <= i; j++)   
				{   
					System.out.print(j+" ");   
				}  
 
				for (j = i-1; j >= 1; j--)  
				{  
					System.out.print(j+" ");  
				}  
				System.out.println();  
			}  
		}  
}


/*


E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q19.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q19
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1

*/