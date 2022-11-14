//Java Program to Illustrate Use of All Features of Abstract Class


abstract class Operations
{
    float a = 12, b = 6, c;
    abstract void add();
    void subtract()
    {
        c = a - b;
        System.out.println("Result:"+c);
    }
    abstract void multiply();
    void divide()
    {
        c = a / b;
        System.out.println("Result:"+c);
    }
}
public class Q1 extends Operations
{
    @Override
    void add()
    {
        c = a + b;
        System.out.println("Result:"+c);
    }
    @Override
    void multiply()
    {
        c = a * b;
        System.out.println("Result:"+c);
    }
    public static void main(String[] args)
    {
        Q1 obj = new Q1();
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}