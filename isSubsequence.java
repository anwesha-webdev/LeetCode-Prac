class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int c=0;
        int indx=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            for(int j=indx;j<t.length();j++)
            {
                char ch1=t.charAt(j);
                if(ch1==ch)
                {
                    c++;
                    indx=j+1;
                    break;
                }
            }
        }
        if(c==s.length())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
