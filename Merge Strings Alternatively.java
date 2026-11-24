class Solution {
    public String mergeAlternately(String word1, String word2)
     {
        int l=word1.length();
        int l1=word2.length();
        int m=(int)Math.min(l,l1);
        String st="";
        for(int i=0;i<m;i++)
        {
            char ch=word1.charAt(i);
            char ch1=word2.charAt(i);
            st=st+ch;
            st=st+ch1;
        }
        int max=(int)Math.max(l,l1);
       if(max==l)
       {
        st=st+word1.substring(m,l);
       }
       else
       {
        st=st+word2.substring(m,l1);
       }
       return st;
     }
}
