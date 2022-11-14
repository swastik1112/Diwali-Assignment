class Q24
{
		public static void main(String args[])
		{
				int n=5;
				
				for(int i=1;i<=n;i++)
				{
					int k=i;
					for(int j=1;j<=i;j++)
					{
						System.out.printf("%d",k);
						k=k+(n-j);			
					}
					System.out.print("\n");
				}
		}
}

/*
OUTPUT

E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q24.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q24
1
26
3710
481113
59121415

*/