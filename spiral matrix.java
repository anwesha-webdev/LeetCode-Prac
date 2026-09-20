class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = n - 1;
        int up = 0;
        int bottom = m - 1;

        while(left <= right && up <= bottom)
        {
            // left → right
            for(int j = left; j <= right; j++)
            {
                list.add(matrix[up][j]);
            }
            up++;

            // up → bottom
            for(int i = up; i <= bottom; i++)
            {
                list.add(matrix[i][right]);
            }
            right--;

            // right → left
            if(up <= bottom)
            {
                for(int j = right; j >= left; j--)
                {
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // bottom → up
            if(left <= right)
            {
                for(int i = bottom; i >= up; i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
