//Write a Java program of swap two elements in an array list.


import java.util.*;

class Q6
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
                
		al.add("Google");
		al.add("Microsoft");
		al.add("Atlassian");
        al.add("Tesla");
			System.out.println("ArrayList before Swap");
				
		for(String str: al)
			
			System.out.println(str+" "); 		

                
                Collections.swap(al, 0, 3);

                System.out.println("ArrayList after Swap");     
				
                for(String str: al)
					
                System.out.println(str+" "); 
	}
}