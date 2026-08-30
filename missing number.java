class Solution
{
    public int missingNumber(int[] nums)
    {
        int n = nums.length;
        int c = 0;
        int j = 0;

        while(c <= n)
        {
            int found = 0;

            for(int i = 0; i < n; i++)
            {
                if(nums[i] == c)
                {
                    found = 1;
                    break;
                }
            }

            if(found == 0)
            {
                j = c;
                break;
            }

            c++;
        }

        return j;
    }
}
