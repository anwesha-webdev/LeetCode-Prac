class Solution 
{
    public double findMaxAverage(int[] nums, int k)
    {
        double sum = 0;

        // First window
        for(int i = 0; i < k; i++)
        {
            sum = sum + nums[i];
        }

        double max = sum;

        // Move the window
        for(int i = k; i < nums.length; i++)
        {
            sum = sum - nums[i - k] + nums[i];

            if(sum > max)
            {
                max = sum;
            }
        }

        return max / k;
    }
}
