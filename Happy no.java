class Solution {
    public boolean isHappy(int n) {
        int x=n;
        int d=0;
        int p=0;
        
        while (x != 1 && x != 4) 
        {
            int s = 0;
        while(x>0)
        {
            d=x%10;
            p=(int)Math.pow(d,2);
            x=x/10;
            s=s+p;
        }
            x=s;
        } 
        if(x==1)
        return true;
        else
        return false;
    }
