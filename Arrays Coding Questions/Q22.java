//How to convert Array to TreeSet in java ? 

import java.util.TreeSet;
 
public class Q22 {
    
    public static void main(String[] args) {
        
        Integer[] numberArray = new Integer[]{3, 2, 5, 1, 4, 2};
        
        TreeSet<Integer> tSetNumbers = new TreeSet<Integer>();
        
        
        for(Integer number : numberArray){
            
           
            tSetNumbers.add(number);
        }
        
        System.out.println("TreeSet contains: " + tSetNumbers);
    }
}