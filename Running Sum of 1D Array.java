class Solution {
    public int[] runningSum(int[] nums) 
    {
        int k=nums.length;
        int s=0;
        int arr[]=new int[k];
        for(int i=0;i<k;i++)
        {
            
             int a=nums[0];
             int b=nums[i]; 
              a=b;             
             s=s+a;
             arr[i]=s;
             
        }
       return arr;
    }
}
