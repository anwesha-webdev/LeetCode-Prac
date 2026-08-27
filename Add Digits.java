class Solution {
    public int addDigits(int num) {
       int x=num;
       int d=0;
       
       while(x>=10)
       {
        int s=0;
        
       while(x!=0) 
       {
        d=x%10;
        s=s+d;
        x=x/10;
       }
        x=s;
       }
      return x;
    }
}  
