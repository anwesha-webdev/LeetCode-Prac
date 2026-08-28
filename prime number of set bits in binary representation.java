class Solution {
    public int countPrimeSetBits(int left, int right) 
    {
        int c=0;
        Solution obj=new Solution();
        for(int i=left;i<=right;i++)
        {
                if(obj.dectobin(i)==1)
                c++;
        }
        return c;
        
    }
    public int primes(int n)
    {
        if(n < 2)
             return 0;

        for(int i = 2; i * i <= n; i++)
         {
               if(n % i == 0)
                    return 0;
        }
       return 1;
    }
    
    public int dectobin(int n) 
    {
        Solution obj=new Solution();
        
        int c=0;
        while (n != 0) {
            int rem = n % 2;
            if(rem==1){
                c++;
            }
            n = n / 2;
        }

        if(obj.primes(c)==1)
             return 1;
         else
             return 0;
    }
}
    
