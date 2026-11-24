
class Solution {
    public int[] frequencySort(int[] nums) 
    {
        int arr[] = new int[nums.length];
        int freq[] = new int[nums.length];

        // Copy original numbers
        for(int i = 0; i < nums.length; i++)
        {
            arr[i] = nums[i];
        }

        // Count frequency of each number
        for(int i = 0; i < nums.length; i++)
        {
            int c = 0;

            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    c++;
                }
            }

            freq[i] = c;
        }

        // Sort by frequency ascending
        // If frequencies are equal, sort numbers descending
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(freq[i] > freq[j] ||
                   (freq[i] == freq[j] && arr[i] < arr[j]))
                {
                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    int temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }
            }
        }

        return arr;
    }
}
