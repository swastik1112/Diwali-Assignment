//Write a program to sum all the values of a given Array in java? 


class Q19 {
    static int arr[] = { 12, 3, 4, 15 };
 

    static int sum()
    {
        int sum = 0; 
        int i;
 
     
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }
 
    
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "+ sum());
    }
}