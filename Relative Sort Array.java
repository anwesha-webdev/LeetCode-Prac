class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int a[]=new int[arr1.length];
         boolean visited[]=new boolean[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j] && !visited[j])
                {
                    a[k++]=arr1[j];
                     visited[j]=true;
                }
            }
        }
        while(k<arr1.length)
        {
          int min = Integer.MAX_VALUE;
          int index=-1;
            for(int j=0;j<arr1.length;j++)
            {
                if(!visited[j] &&  arr1[j]<min)
                {
                    min=arr1[j];
                    index=j;
                }
            }
                a[k++]=min;
                visited[index] = true;
            }
        return a;
    }
    
}
