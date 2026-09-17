class Solution {
    public int subtractProductAndSum(int n) 
    {
        int x=n;
        int m=1;
        int d=0;
        int s=0;
        int sub=0;
        while(x!=0)
        {
            d=x%10;
            m=m*d;
            s=s+d;
            x/=10;
        }
        sub=m-s;
        return sub;
    }
}
