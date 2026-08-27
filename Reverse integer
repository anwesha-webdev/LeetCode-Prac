class Solution {
    public int reverse(int x) 
    {
        int n=x;
        long r=0;
        int d=0;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE)
        {
            return 0;
        }

        return (int) r;
    }
}
