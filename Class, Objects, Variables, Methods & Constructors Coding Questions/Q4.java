// Java Program to Illustrates Use of Static Inner Class
  
// Outer class
public class Q4 {
  
    // Display message of inner class
    static String msg = "my world";
  
    // Static Inner Class
    static class InnerClass {
  
        // Static Inner Class Method
        public void display()
        {
            // Display message of inner class
            System.out.println("Welcome to " + msg);
        }
    }
  
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an instance of the static inner class
        InnerClass instance = new InnerClass();
  
        // Calling method display through the inner class instance variable
        instance.display();
    }
}