 //Find out smallest and largest number in a given Array? 
 
 
import java.util.*;

class Q5
{
		public static void main(String args[])
		{
			int large,small,i;
			
			int a[] = new int[]{1, 2, 3, 4, 5};
			
			int n = a.length;
			
			large=small=a[0];
			
			for(i=1;i<n;++i)
			{
				if(a[i]>large)
					
				large=a[i];  

				if(a[i]<small)
					
				small=a[i];
			}

				System.out.print("The smallest elemnts is: "+small);
				
				System.out.print("\n The largest elemnts is: "+large);
		}
}