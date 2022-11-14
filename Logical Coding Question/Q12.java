class Q12
{
public static void main(String args[])
{

for (char i='A'; i<='F'; i++)

{
for (char j='F'; j>=i; j--)
{

System.out.print(" ");
}
for (char k='A'; k<=i; k++)
System.out.print(k+" ");
System.out.println();
}

}

}