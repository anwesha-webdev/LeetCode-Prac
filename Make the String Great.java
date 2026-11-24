class Solution {
    public String makeGood(String s) 
    {
        String st="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(st.length()>0 && (int)Math.abs(st.charAt(st.length()-1)-ch)==32)
            {
                st=st.substring(0,st.length()-1);
            }
            else
            {
                st=st+ch;
            }
        }
        return st;
    }
}
