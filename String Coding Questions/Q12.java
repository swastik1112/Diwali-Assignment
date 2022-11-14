// For example, if the input is "Java is Great" and asked to replace space with %20 then it 
should be "Java%20is%20Great".


public class Q12    
{    
    public static void main(String[] args) {    
        String string = "Once in a blue moon";    
        char ch = '-';    
            
        //Replace space with specific character ch    
        string = string.replace(' ', ch);    
            
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(string);    
    }    
}      
