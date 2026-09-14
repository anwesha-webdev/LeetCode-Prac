class Solution {
    public String toHex(int num) {

        if(num == 0)
            return "0";

        long x = num;

        if(x < 0)
            x = x + 4294967296L;

        String s = "";
        int arr[] = {'a','b','c','d','e','f'};

        while(x != 0) {

            int d = (int)(x % 16);
            x = x / 16;

            if(d >= 10)
                s = (char)arr[d - 10] + s;
            else
                s = d + s;
        }

        return s;
    }
}
