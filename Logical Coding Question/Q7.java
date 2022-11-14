class Q7
{
		public static void main(String args[])
		{
				int n=5;
				
				for(int i=1;i<=n;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.print(((i+j)%2)+"");
					}
						System.out.println();
				}
		}
}

/*
OUTPUT


E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q7.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q7
10101
01010
10101
01010
10101



*/