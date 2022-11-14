//How to reverse words in a sentence without using a library method?


 Java program to reverse a string
// s = input()
public class Q14
{
 
    public static void main(String[] args)
    {
        String s[] = "i like this program very much".
                                        split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            ans += s[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(ans.substring(0,
                                  ans.length() - 1));
    }
}