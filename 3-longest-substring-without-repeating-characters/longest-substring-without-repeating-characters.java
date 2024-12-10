class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLength = 0;
        String currentSubstring = "";

        for (int i = 0; i < s.length(); i++) 
        {
            char currentChar = s.charAt(i);
            if (currentSubstring.contains(String.valueOf(currentChar))) 
            {
                currentSubstring = currentSubstring.substring(currentSubstring.indexOf(currentChar) + 1);
            }
            currentSubstring += currentChar;
            maxLength = Math.max(maxLength, currentSubstring.length());
        }

        return maxLength;
    }

}