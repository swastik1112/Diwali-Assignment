class Q11
{
public static void main(String args[])
{

for (char i='F'; i>='A'; i--)
{
for (char j='A'; j<=i; j++)
{
System.out.print(j+" " );
}
System.out.println(" ");
}
for(char k='A';k<='F';k++)
{
for(char m='A';m<=k;m++)
{
System.out.print(m+" ");
}
System.out.println();
}
}
}

/*

OUTPUT

E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q11.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q11
A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F

*/