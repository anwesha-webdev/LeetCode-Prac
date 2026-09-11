class Solution {
    public boolean backspaceCompare(String s, String t)
    {
        String st="";
        String st1="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch!='#')
            {
                st=st+ch;
            }
            else
            {
                if(st.length()>0)
                {
                    st=st.substring(0,st.length()-1);
                }
            }
        }

        for(int j=0;j<t.length();j++)
        {
            char ch=t.charAt(j);

            if(ch!='#')
            {
                st1=st1+ch;
            }
            else
            {
                if(st1.length()>0)
                {
                    st1=st1.substring(0,st1.length()-1);
                }
            }
        }

        if(st1.equals(st))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
