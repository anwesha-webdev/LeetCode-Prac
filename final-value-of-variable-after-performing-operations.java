class Solution {
    public int finalValueAfterOperations(String[] operations) 
    {
        int l=operations.length;
        int X=0;
        for(int i=0;i<l;i++)
        {
            if(operations[i].equals("--X"))
            {
                 X=X-1;
                
            }
            else if(operations[i].equals("X--"))
            {
                 X=X-1;
                 
            }
            else if(operations[i].equals("X++"))
            {
                 X=X+1;
                 
            }
            else if(operations[i].equals("++X"))
            {
                 X=X+1;
                 
            }
        }
        return X;
    }
}
