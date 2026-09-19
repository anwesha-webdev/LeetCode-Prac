class Solution {
    public String convertToBase7(int num) 
    {
        int x=Math.abs(num);
        int d=0;
        String s="";
       if(num == 0)
            return "0";
           
        while(x!=0)
        {
            d=x%7;
            s=Integer.toString(d)+s;
            x/=7;
        }
         if(num<0)
            {
                s="-"+s;
            }
       
        return s;
    }
}
