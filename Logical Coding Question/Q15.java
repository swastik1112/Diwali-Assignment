public class Q15
{
    public static void main(String[] args)
    {
        int rows = 6;
        
        for (int i = 1; i <= rows; i++)
        {
          for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
          for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }  
            System.out.println();
        }
        
 
        
        }
     
    }
	
	
/*

E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q15.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q15
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6
    5 6
     6


*/