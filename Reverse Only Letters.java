class Solution {
    public String reverseOnlyLetters(String s) 
    {
        String st = "";
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            {
                st = ch + st;
            }
        }
        
        String ans = "";
        int j = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            {
                ans = ans + st.charAt(j);
                j++;
            }
            else
            {
                ans = ans + ch;
            }
        }
        
        return ans;
    }
}
