class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        boolean hash[] = new boolean[128];

        int i = 0;
        int j = 0;
        int max = 0;

        while(j < s.length())
        {
            char ch = s.charAt(j);

            if(hash[ch] == false)
            {
                hash[ch] = true;
                j++;

                if(j - i > max)
                {
                    max = j - i;
                }
            }
            else
            {
                hash[s.charAt(i)] = false;
                i++;
            }
        }

        return max;
    }
}
