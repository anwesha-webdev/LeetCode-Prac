class Solution {
    public int strStr(String haystack, String needle) 
    {
        int s=0;
        int c=0;
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            c=0;
            for(int j=0;j<needle.length();j++)
            {
                if(haystack.charAt(i+j)==needle.charAt(j))
                {
                    s=i;
                    c++;
                }
                else
                {
                    break;
                }
            }
            if(c==needle.length() )
            {
                return s;
            }
        }
        return -1;
    }
}
