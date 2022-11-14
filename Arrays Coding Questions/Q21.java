// How to convert Array to ArrayList in java ?

import java.util.Arrays;
import java.util.List;

public class Q21
{
	public static void main(String args[])
	{
		String[] metals ={"Gold","Silver","Platinum"};
		List metalsList = Arrays.asList(metals);
		System.out.println("Converted List :"+metalsList);
	}
}