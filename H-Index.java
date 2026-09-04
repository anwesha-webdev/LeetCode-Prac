class Solution {
    public int hIndex(int[] citations) 
    {
        int n=citations.length;
        int b=0;
        for(int i=1;i<=n;i++)
        {
            
            int  c=0;
            for(int j=0;j<n;j++)
            {
                  
               if(citations[j]>=i)
               {
                c++;
               }
               if(c>=i)
                {
                   b=(int)Math.max(b, i);;
                }
            }
          
        }
       return b;
        
    }
}
