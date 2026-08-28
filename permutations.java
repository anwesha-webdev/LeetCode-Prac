class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        permuteHelper(nums, 0, result);

        return result;
    }

    public void permuteHelper(int[] nums, int index, List<List<Integer>> result) {

        // Base case
        if (index == nums.length) {

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }

            result.add(list);
            return;
        }

        // Try every element
        for (int i = index; i < nums.length; i++) {

            // Swap
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            // Recursion
            permuteHelper(nums, index + 1, result);

            // Backtrack
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}
    
