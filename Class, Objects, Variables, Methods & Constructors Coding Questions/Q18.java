//Java Program to Illustrates Use of Chaining Constructor


 
class Q18
{
    
    Q18()
    {
        
        this(5);
        System.out.println("The Default constructor");
    }
 
    
    Q18(int x)
    {
       
        this(5, 15);
        System.out.println(x);
    }
 
    
    Q18(int x, int y)
    {
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    {
       
        new Q18();
    }
}
