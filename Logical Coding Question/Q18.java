class Q18
{
		public static void main(String args[])
		{
				int n=7;
				
				for(int i=n;i>=1;i--)
				{
				
					for(int j=n;j>=i;j--)
					{
						System.out.printf(j+" ");
							
					}
					System.out.println();
				}
		}
}

/*
OUTPUT

E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q18.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q18
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1



*/