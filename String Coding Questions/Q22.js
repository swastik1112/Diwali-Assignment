//Write a program to find the longest palindrome in a string?

public class Q22 {

  public static void main(String[] args) {
    PalDemo pd = new PalDemo();
    
    String pal = pd.findLongestPalindrome("bananas");
    System.out.println("" + pal);
    
    pal = pd.findLongestPalindrome("abaradar121");
    System.out.println("" + pal);
  }
    
  public String findLongestPalindrome(String s) {
    // Validations
    if (s.isEmpty()) {
      return "Please enter a String";
    }

    if (s.length() == 1) {
      return s;
    }
    // Validations end
    // Start with one char (starting) as a longest palindrome
    String longest = s.substring(0, 1);
    for (int i = 0; i < s.length(); i = i+1) {        
      // get longest palindrome for odd length (center is i)
      String tmp = checkForEquality(s, i, i);
      if (tmp.length() > longest.length()) {
        longest = tmp;
      }

      // get longest palindrome for even length (center is i, i+1)
      tmp = checkForEquality(s, i, i + 1);
      if (tmp.length() > longest.length()) {
        longest = tmp;
      }
    }
    return longest;
  }