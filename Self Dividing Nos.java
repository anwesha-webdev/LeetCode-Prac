class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> ans = new ArrayList<>();
       Solution obj=new Solution();
       for(int i=left;i<=right;i++)
       {
         if (obj.selfDivide(i)==1)
          ans.add(i);    
       }
           return ans;
    }
    
    public int selfDivide(int n)
    {
         int x=n;
         int d=0;
         int c=0;
         int i=0;
         int flag=0;
         while(x!=0)
         {
            d=x%10;
            if(d==0)
            {
                flag=1;
            }
            else if(n%d==0)
                { 
                c++;
                }
            
            x=x/10;
            i++;
         }
         if(i==c && flag==0)
            return 1;
            else
            return 0;
    }
}
