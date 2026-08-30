class Solution {
    public void moveZeroes(int[] nums) {
        
        int k = 0;

        // Put all non-zero elements at the front
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Put zeros in the remaining positions
        while(k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }
}
