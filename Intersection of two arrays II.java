class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int min = Math.min(nums1.length, nums2.length);
         int c[] = new int[min];
          boolean[] used = new boolean[nums2.length];
        int k = 0;

      for(int i = 0; i < nums1.length; i++)
      {
          for(int j = 0; j < nums2.length; j++)
          {
             if(nums1[i] == nums2[j] && !used[j])
            {
                c[k++] = nums1[i];
                used[j]=true;
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
        
 
