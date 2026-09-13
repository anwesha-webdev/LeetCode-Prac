class Solution {
    public String reverseWords(String s) 
    {
        s=s+" ";
        String revStr="";
        String st="";
        String rev="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch!=' ')
            {
                st=st+ch;
            }
            else
            {
                rev="";
                
                for(int j=0;j<st.length();j++)
                {
                    rev=st.charAt(j)+rev;
                }

                revStr=revStr+rev+" ";
                st="";
            }
        }
      
        revStr=revStr.trim();
        return revStr;
    }
}
