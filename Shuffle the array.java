  class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] arr = new int[2 * n];

        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
        }

        for (int i = n; i < 2 * n; i++) {
            arr[2 * (i - n) + 1] = nums[i];
        }

        return arr;
    }
}
        
