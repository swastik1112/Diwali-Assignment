class Q21
{
public static void main(String args[])
{
int n=7;

for (char i=1; i<=n; i++)

{
for (char j=1; j<=i; j++)
{

System.out.print((j%2)+"");
}
System.out.println();
}

}

}

/*
OUTPUT

E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q21.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q21
1
10
101
1010
10101
101010
1010101

*/