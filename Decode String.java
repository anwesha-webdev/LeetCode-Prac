class Solution {
    public String decodeString(String s) 
    {
        while(s.contains("]"))
        {
            int end = 0;
            int start = 0;

            // Find ]
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == ']')
                {
                    end = i;
                    break;
                }
            }

            // Find matching [
            for(int i = end - 1; i >= 0; i--)
            {
                if(s.charAt(i) == '[')
                {
                    start = i;
                    break;
                }
            }

            // Find number before [
            int numStart = start - 1;

            while(numStart >= 0 && 
                  s.charAt(numStart) >= '0' && 
                  s.charAt(numStart) <= '9')
            {
                numStart--;
            }

            numStart++;

            int num = 0;

            for(int i = numStart; i < start; i++)
            {
                num = num * 10 + (s.charAt(i) - '0');
            }

            // Get string inside [ ]
            String st = "";

            for(int i = start + 1; i < end; i++)
            {
                st = st + s.charAt(i);
            }

            // Repeat it
            String temp = "";

            for(int i = 0; i < num; i++)
            {
                temp = temp + st;
            }

            // Replace number[string] with decoded string
            s = s.substring(0, numStart) + temp + s.substring(end + 1);
        }

        return s;
    }
}
