class Solution {
    public String reverseWords(String s) 
    {
         
         String rev="";
        String st[]=s.split(" ");
        for(int i=st.length-1;i>=0;i--)
        {
            rev=rev+" "+st[i];
        }
        rev = rev.trim().replaceAll("\\s+", " ");
        return rev;
    }
}
