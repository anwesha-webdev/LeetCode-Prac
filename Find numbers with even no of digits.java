class Solution {
    public int findNumbers(int[] nums) 
    {
       Solution obj=new Solution();
       int len=nums.length;
       int d=0;
       for(int i=0;i<len;i++)
       {
        if (obj.countdigits(nums[i])==1)
         {
            d++;
         }
       }
       return d; 
    }
    int countdigits(int n)
    {
        int x=n;
        int d=0;
        int c=0;
        while(x!=0)
        {
            d=x%10;
            c++;
            x=x/10;
        }
        if(c%2==0)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}
