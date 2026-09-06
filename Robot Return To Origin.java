class Solution {
    public boolean judgeCircle(String moves) 
    {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='U')
            {
                x++;
            }
            if(ch=='D')
            {
                x--;
            }
            if(ch=='L')
            {
                y++;
            }
            if(ch=='R')
            {
                y--;
            }
        }
        if(x==0 && y==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
