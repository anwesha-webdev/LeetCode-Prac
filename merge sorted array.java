class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int c[]=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            c[k++]=nums1[i];
        }
        
        for(int i=0;i<n;i++)
        {
            c[k++]=nums2[i];
        }
        int t=0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k-i-1;j++)
            {
                if(c[j]>c[j+1])
                {
                    t=c[j];
                    c[j]=c[j+1];
                    c[j+1]=t;
                }
            }
        }
        for(int i=0;i<m+n;i++)
        {
            nums1[i]=c[i];
            
        }
        for(int i=0;i<m+n;i++)
        {
            System.out.print(nums1[i]+" ");
            
        }
    }
}
