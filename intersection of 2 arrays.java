class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int min = Math.min(nums1.length, nums2.length);
int[] c = new int[min];
int k = 0;

for(int i = 0; i < nums1.length; i++)
{
    for(int j = 0; j < nums2.length; j++)
    {
        if(nums1[i] == nums2[j])
        {
            boolean found = false;

            for(int x = 0; x < k; x++)
            {
                if(c[x] == nums1[i])
                {
                    found = true;
                    break;
                }
            }

            if(!found)
            {
                c[k] = nums1[i];
                k++;
            }

            break;
        }
    }
}

int[] ans = new int[k];

for(int x = 0; x < k; x++)
{
    ans[x] = c[x];
}

return ans;
        
    }
}
