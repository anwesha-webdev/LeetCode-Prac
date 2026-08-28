class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int j=nums.length;
        int arr[]=new int[j*2];
        int k=0;
        for(int i=0;i<j;i++){
        arr[k++]=nums[i];
        }
        for(int i=0;i<j;i++){
        arr[k++]=nums[i];
        }
        return arr;
    }
}
