class Solution {
    public boolean isPowerOfThree(int n) 
    {
        int c=0;
        for(int i=0; Math.pow(3,i)<=n; i++)
        {
            int x=(int)(Math.pow(3,i));
            if(n==x)
            c++;
            
        }
        if((c==1)||(n==1))
         return true;
         else
         return false;
    }
}
  
