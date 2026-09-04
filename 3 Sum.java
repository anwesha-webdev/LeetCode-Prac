import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        // 1. Bubble Sort
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // 2. Find the triplets
        for(int i = 0; i < n - 2; i++)
        {
            // Skip duplicate first numbers
            if(i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];

                // Sum is 0
                if(sum == 0)
                {
                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    ans.add(temp);

                    // Skip duplicate j values
                    while(j < k && nums[j] == nums[j + 1])
                    {
                        j++;
                    }

                    // Skip duplicate k values
                    while(j < k && nums[k] == nums[k - 1])
                    {
                        k--;
                    }

                    j++;
                    k--;
                }

                // Sum is too small
                else if(sum < 0)
                {
                    j++;
                }

                // Sum is too large
                else
                {
                    k--;
                }
            }
        }

        return ans;
    }
}
