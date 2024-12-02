class Solution 
{
    public static boolean isPalindrome(String s) 
    {
      String normalized = "";
      for(int i = 0; i < s.length(); i++)
      {
        char c = s.charAt(i);
        if(Character.isLetterOrDigit(c))
        {
            normalized += Character.toLowerCase(c);
        }
      } 

      String reverseStr = new StringBuilder(normalized).reverse().toString(); 
      return normalized.equals(reverseStr);
    }

    public static void main(String[] args)
    {
        String s1 = "race a car";
        System.out.println(isPalindrome(s1));
        String s2 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s2));
    }
}