class Q23
{
		public static void main(String args[])
		{
				int n=7;
				
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


E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q23.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q23
1010101
0101010
1010101
0101010
1010101
0101010
1010101



*/