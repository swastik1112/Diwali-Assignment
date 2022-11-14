
public class Q2 
{

	public static void main(String[] args) 
	{

		int rows=5;

		for (int i = rows; i >= 1; i--) 
		{

			for (int j = i; j < rows; j++) 
			{

				ystem.out.print(" "); 

			}

				for (int k = 1; k <= (2 * i - 1); k++) 
				{

					if (k == 1 || i == rows || k == (2 * i - 1)) 
					{ 

						System.out.print("*"); 

					}
					else
					{

						System.out.print(" "); 

					}

				}

					System.out.println("");

		}


	}

}


/*

E:\OOPJ & JAVA Assignments\Logical Coding Question>javac Q2.java

E:\OOPJ & JAVA Assignments\Logical Coding Question>java Q2
*********
 *     *
  *   *
   * *
    *

*/