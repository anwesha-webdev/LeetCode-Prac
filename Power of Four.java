class Solution {
    public boolean isPowerOfFour(int n) {
        int c=0;
        for(int i=0; Math.pow(4,i)<=n; i++)
        {
            int x=(int)(Math.pow(4,i));
            if(n==x)
            c++;
            
        }
        if((c==1)||(n==1))
         return true;
         else
         return false;
    }
}
  
