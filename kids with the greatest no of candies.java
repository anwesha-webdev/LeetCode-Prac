class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        Solution obj=new Solution();
        int c=0;
       List<Boolean> arr = new ArrayList<>();;
        for(int i=0;i<candies.length;i++)
        {
            c=candies[i]+extraCandies;
            boolean flag=obj.sort(candies,c);
            arr.add(flag);
        }
        return arr;
    }
    public boolean sort(int arr[],int n)
    {
        int max=0;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]>max)
        {
            max=arr[i];
        }
       }
       if(n>=max)
       {
        return true;
       }
       else
       {
        return false;

       }
    }
}
