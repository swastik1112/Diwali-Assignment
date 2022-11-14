 //How to convert a byte array to String?
 
 
 class Q11
{
    public static void main(String[] args) throws IOException
    {
        byte[] bytes = "Techie Delight".getBytes();
       
        String string = new String(bytes);
		
        System.out.println(string);
    }
}