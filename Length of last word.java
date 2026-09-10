class Solution {
    public int lengthOfLastWord(String s)
     {
       
        String st[]=s.split(" ");
        String last=st[st.length-1];
        return last.length();
    }
}
