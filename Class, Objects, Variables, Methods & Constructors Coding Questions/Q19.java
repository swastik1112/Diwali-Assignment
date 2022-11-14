//Java Program to Create an Object for Class and Assign Value in the Object using 
//Constructor



public class Q19
{
    
    String name;
    String course;
    int age;
   
  
    public Q19(String name, String course,int age)
    {
        this.name = name;
        this.course = course;
        this.age = age;
    }
   
  
    public String getName()
    {
        return name;
    }
   
  
    public static void main(String[] args)
    {
        
        Q19 s1 = new Q19("Ravi","CSE",23);
        
        System.out.println(s1.getName());
    }
}