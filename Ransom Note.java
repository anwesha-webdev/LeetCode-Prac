class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int c=0;
        String st="";
          boolean[] used = new boolean[ransomNote.length()];
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            for(int j=0;j<ransomNote.length();j++)
            {
                char ch1=ransomNote.charAt(j);
                if((ch==ch1) && used[j]==false)
               {
                   c++;
                   used[j]=true;
                   break;
               }
            }
        }
        if(c==(ransomNote.length()))
            return true;
        else
            return false;
        
    }
}
