//Java Program to Allocate and Initialize Super Class Members using Constructor



import java.util.*;
class y {
    int b;
    int c;
    y(int b, int c)
    {
        this.b = b;
        this.c = c;
        System.out.println("Hi I am parent constructor");
        System.out.println("multiplication of two number " + b + " and " + c + " is " + b * c);
    }
}
class x extends y {
    int a;
  
    x(int b, int c, int a)
    {
        
          
        super(b, c);
        System.out.println(
            "Hi I am child class constructor");
        System.out.println("class field of x class is "
                           + a);
    }
}
  
class Q21 {
  
    public static void main(String[] args)
    {
        
        x obj = new x(3, 4, 5);
    }
}
