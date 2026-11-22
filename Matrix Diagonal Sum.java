class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int m=mat.length;
        int n=mat[0].length;
        int s=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==j) || (i+j)==m-1)
                {
                    s=s+mat[i][j];
                }
            }
        }
        return s;
    }
}
