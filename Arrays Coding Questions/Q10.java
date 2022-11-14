//Given an array of integers, print whether the numbers are in ascending order or in 
//descending order or in random order without sorting
//Input: [5,14,35,90,139] Output: Ascending 
//Input: [88,67,35,14,-12] Output: Descending
//Input: [65,14,129,34,7] Output: Random


public class Q10 {  
    public static void main(String[] args) {      
         
        int [] arr = new int [] {5, 2, 8, 7, 1};   
        int temp = 0;  
          
        
        System.out.println("Elements of original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
          
       
        for (int i = 0; i < arr.length; i++) {   
            for (int j = i+1; j < arr.length; j++) {   
               if(arr[i] < arr[j]) {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }   
            }   
        }  
          
        System.out.println();  
          
        
        System.out.println("Elements of array sorted in descending order: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
    }  
}  