//Write a Java program to find all pairs of elements in an integer array whose sum is equal 
//to a given number

public class Q3
{
    static void findThePairs(int intArr[], int intNum)
    {
        System.out.println("Pairs of elements whose sum is "+intNum+" are : ");
 
        for (int i = 0; i < intArr.length; i++)
        {
            for (int j = i+1; j < intArr.length; j++)
            {
                if(intArr[i]+intArr[j] == intNum)
                {
                    System.out.println(intArr[i]+" + "+intArr[j]+" = "+intNum);
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
 
        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
 
        findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
 
        findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
    }
}