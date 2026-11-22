class Solution {
    public int smallestEvenMultiple(int n) 
    {
        int x=0;
        for(int i=1;i<=n+n;i++)
        {
            if(i%2==0 && i%n==0)
            {
                 x=i;
                break;
            }
        }
        return x;
    }
}
