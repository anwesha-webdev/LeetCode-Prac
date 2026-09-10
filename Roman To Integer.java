class Solution {
    public int romanToInt(String s) 
    {
        int s1 = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            int value = 0;

            if(ch == 'I')
            {
                value = 1;
            }
            if(ch == 'V')
            {
                value = 5;
            }
            if(ch == 'X')
            {
                value = 10;
            }
            if(ch == 'L')
            {
                value = 50;
            }
            if(ch == 'C')
            {
                value = 100;
            }
            if(ch == 'D')
            {
                value = 500;
            }
            if(ch == 'M')
            {
                value = 1000;
            }

            if(i + 1 < s.length())
            {
                char next = s.charAt(i + 1);
                int nextValue = 0;

                if(next == 'I')
                    nextValue = 1;
                if(next == 'V')
                    nextValue = 5;
                if(next == 'X')
                    nextValue = 10;
                if(next == 'L')
                    nextValue = 50;
                if(next == 'C')
                    nextValue = 100;
                if(next == 'D')
                    nextValue = 500;
                if(next == 'M')
                    nextValue = 1000;

                if(value < nextValue)
                {
                    s1 = s1 - value;
                }
                else
                {
                    s1 = s1 + value;
                }
            }
            else
            {
                s1 = s1 + value;
            }
        }

        return s1;
    }
}
