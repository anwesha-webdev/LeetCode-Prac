class Solution {
    public String largestNumber(int[] nums) 
    {
        int n = nums.length;
        
        // Convert numbers into Strings
        String[] arr = new String[n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = String.valueOf(nums[i]);
        }
        
        // Bubble Sort
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                String a = arr[j];
                String b = arr[j + 1];
                
                // Check which order makes the larger number
                if((a + b).compareTo(b + a) < 0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        if(arr[0].equals("0"))
        {
            return "0";
        }
        
        // Join all strings
        String ans = "";
        
        for(int i = 0; i < n; i++)
        {
            ans = ans + arr[i];
        }
        
        return ans;
    }
}
