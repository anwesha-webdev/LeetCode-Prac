class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        int s[]=new int[nums.length];
        int k=0;
        for(int i=0;i<s.length;i++)
        {
            if(nums[i]%2==0)
            {
                s[k++]=nums[i];
            }
        }
         for(int i=0;i<s.length;i++)
        {
            if(nums[i]%2!=0)
            {
                s[k++]=nums[i];
            }
        }
       
       return s;
    }
}
