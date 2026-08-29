class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int m = accounts.length;
        int max=0;
        
        for(int i=0;i<m;i++)
        {
            int s=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                s=s+accounts[i][j];
            }  
            if(max<s)
         {
            max=s;
         }
        }
         
         return max;
    }
}
