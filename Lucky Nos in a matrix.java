class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        int m=matrix.length;
        List<Integer> arr = new ArrayList<>();
        int n=matrix[0].length;
            
            for(int i=0;i<m;i++)
            {
                int min=Integer.MAX_VALUE;
                 int col=0;
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    col=j;
                }
            }
           int max = Integer.MIN_VALUE;
              for(int r=0; r<m; r++)
              {
                  if(matrix[r][col] > max)
                  {
                      max = matrix[r][col];
                  }
               }
            
               if(min == max)
               {
                    arr.add(min);
               }
            }
               return arr;
        }
        
    }
