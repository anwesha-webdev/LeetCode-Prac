class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        Solution obj=new Solution();
        int sorted[] = nums.clone();
        int arr[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            int number=nums[i];
            int no=obj.bubblesort(sorted,number);
            arr[i]=no;
        } 
        return arr;
    }
    public int bubblesort(int arr[],int number)
    {
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
          if(number==arr[i])
          {
            s=arr.length-1-(i);
           
          }
        }
            return s;
        
    }
}
