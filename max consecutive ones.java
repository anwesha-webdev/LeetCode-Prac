class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int l=nums.length;
        int m=0;
        int c=0;
        for(int i=0;i<l;i++)
        {
            
            if(nums[i]==1)
            {
                c++;
            }
            else
            {
                 if(c > m)
                {
                   m = c;
                }
              c = 0;
            }   
        }
         if(c > m)
        {
            m = c;
        }

        return m;
    }
}
