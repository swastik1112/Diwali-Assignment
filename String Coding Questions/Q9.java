//How to convert numeric String to an int?

public class Q9 {  

    public static void main(String[] args) {  
      
        String str1 = "1432";  
		
        int result = Integer.parseInt(str1); 
		
        System.out.println(result);  
   
       
        String str2 = "143";  
		
        Integer result2 = Integer.valueOf(str2);  
		
        System.out.println(result2);  
   
    }  
}  