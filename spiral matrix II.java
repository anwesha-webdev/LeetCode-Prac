class Solution {
    public int[][] generateMatrix(int n)
    {
         int matrix[][] = new int[n][n];

        int up = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;
        while(left <= right && up <= bottom)
        {
            // left → right
            for(int j = left; j <= right; j++)
            {
                matrix[up][j]=num;
                num++;
            }
            up++;

            // up → bottom
            for(int i = up; i <= bottom; i++)
            {
                matrix[i][right]=num;
                num++;
            }
            right--;

            // right → left
            if(up <= bottom)
            {
                for(int j = right; j >= left; j--)
                {
                    matrix[bottom][j]=num;
                    num++;
                }
                bottom--;
            }

            // bottom → up
            if(left <= right)
            {
                for(int i = bottom; i >= up; i--)
                {
                   matrix[i][left]=num;
                   num++;
                }
                left++;
            }
        }

        return matrix;
    }
}
