class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        int m=image.length;
        int n=image[0].length;
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(image[i][j]==0)
                {
                    arr[i][j]=1;
                }
                else
                {
                    arr[i][j]=0;
                }
            }
        }
      for(int i = 0; i < arr.length; i++) {

             int left = 0;
            int right = arr[i].length - 1;

          while(left < right) 
          {

        int temp = arr[i][left];
        arr[i][left] = arr[i][right];
        arr[i][right] = temp;

           left++;
           right--;
         }
      }
      return arr;
    }
}
