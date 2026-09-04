class Solution {
    public int removeDuplicates(int[] nums)
    {
        int k=0;
        int n=nums.length;
        int c[]=new int[n]; 
        c[0]=nums[0];
        for(int i=0;i<n;i++)
        {
            if(c[i]!=nums[i+1])
            {
                c[k++]=nums[i];
            }
        }
        for(int i=0;i<k;i++)
        {
            nums[i]==c[i];
        }
        return k;
    }
}
