class Solution {
    public String reverseVowels(String s) 
    {
        char arr[]=new char[s.length()];
        String str="";
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                arr[k++]=ch;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                str=str+arr[--k];
            }
            else
            {
                str=str+ch;
            }
        }
        return str;
        
    }
}
