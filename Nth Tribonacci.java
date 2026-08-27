class Solution {
    public int tribonacci(int n) 
    {
        int a=0;
        int b=1;
        int c=1;
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=a+b+c;
            a=b;
            b=c;
            c=s;
        }
        return a;
    }
}
    
