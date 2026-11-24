class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int l=nums.length;
        int k=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=val)
            {
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}
