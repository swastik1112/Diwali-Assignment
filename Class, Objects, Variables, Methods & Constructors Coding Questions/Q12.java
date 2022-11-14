//Java Program to Create a Method without Parameters and with Return Type

import java.util.*;
 
class Circle {
   
    double radius;
   
    
    double circumference()
    {
        
        double r = 5;
        double circum = 2 * 3.14 * r;
       
        return circum;
    }
}
public class Q12 {
   
    public static void main(String args[])
    {
        
        Circle c = new Circle();
        double circum;

        circum = c.circumference();
        System.out.println("Circumference of circle is : " + circum);
    }
}