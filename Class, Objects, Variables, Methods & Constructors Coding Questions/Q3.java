//Java Program to Illustrates Use of Instance Inner Class



class Outer 
{
    int outer_x = 100;
    void test() 
    {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner 
    {
        int y = 10; 
        void display() 
        {
            System.out.println("display: outer x = " + outer_x);
        }
    }
   // void show y() 
   // {
        //System.out.println(y); 
   //}
}
class Q3 
{
    public static void main(String args[]) 
    {
        Outer outer = new Outer();
        outer.test();
    }
}