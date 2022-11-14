//How to replace each given character to other e.g. blank with %20?


class Q11
{
    public static void main(String[] args)
    {
        
        String str = "Mr John Smith   ";
         
       
        str = str.trim();
         
       
        str = str.replaceAll("\\s", "%20");
        
        System.out.println(str);
    }
}