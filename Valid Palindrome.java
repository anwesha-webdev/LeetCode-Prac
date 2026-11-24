class Solution {
    public boolean isPalindrome(String s)
    {
        s=s.toLowerCase();
        String st="";
        String st1="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
             if(((ch!=' ')&&((int)ch >= 97 && (int)ch <= 122) || ((int)ch >= 48 && (int)ch <= 57)))
            {
                st=st+ch;
            }
        }
        for(int i=st.length()-1;i>=0;i--)
        {
            char ch=st.charAt(i);
            if(ch!=' ')
            {
                st1=st1+ch;
            }
        }
        if(st.equals(st1)==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
