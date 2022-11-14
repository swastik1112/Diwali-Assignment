
class Q20 
{  
public static void main(String[] args)   
{  
int rows=7;  
  
for (int i = 1; i <= rows; i++)   
{  
 
for (int j = 1; j < i; j++)   
{  
System.out.print(" ");  
}  
 
for (int j = i; j <= rows; j++)   
{   
System.out.print(j);   
}   
System.out.println();   
}   
   
for (int i = rows-1; i >= 1; i--)   
{  
 
for (int j = 1; j < i; j++)   
{  
System.out.print(" ");  
}  

for (int j = i; j <= rows; j++)  
{  
System.out.print(j);  
}  
System.out.println();  
}  
}  
}  

/*


E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q20.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q20
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567


*/