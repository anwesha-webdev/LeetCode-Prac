class Solution {
    public int search(int[] nums, int target) 
    {
        int f=0;
        int i=-1;
        int l=nums.length-1;
        while(f<=l)
        {
            int mid=(f+l)/2;
            if(nums[mid]>target)
            {
                l=mid-1;
            }
            else if(nums[mid]<target)
            {
                f=mid+1;
            }
            else
            {
                i= mid;  
                break;
            }
        }
         return i;
    }
}
        
    
