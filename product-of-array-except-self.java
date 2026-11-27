
class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int l = nums.length;
        int answer[] = new int[l];

        int pre = 1;
        int suff = 1;

        // Prefix product
        for(int i = 0; i < l; i++)
        {
            answer[i] = pre;
            pre = pre * nums[i];
        }

        // Suffix product
        for(int i = l-1; i >= 0; i--)
        {
            answer[i] = answer[i] * suff;
            suff = suff * nums[i];
        }

        return answer;
    }
}
