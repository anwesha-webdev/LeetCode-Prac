class Solution {
    public int majorityElement(int[] nums) 
    {
        int l=nums.length;
        Arrays.sort(nums);  
        return nums[(int)l/2];
    }
}
