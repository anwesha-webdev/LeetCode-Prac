class Solution {
    public boolean isPerfectSquare(int num)
    {
      int c=0;
       for(int i=1;(long)i * i<=num;i++)
       {
        if((long)(i*i)==num)
         c++;
       } 
       if(c==1 || num==1)
         return true;
       else
         return false;
    }
}
