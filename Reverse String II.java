
class Solution {
    public String reverseStr(String s, int k)
    {
        int n = s.length();
        char arr[] = s.toCharArray();

        for(int i=0; i<n; i=i+2*k)
        {
            int left = i;
            int right = Math.min(i+k-1,n-1);

            while(left<right)
            {
                char t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
