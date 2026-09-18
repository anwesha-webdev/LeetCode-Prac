class Solution {
    public int nthUglyNumber(int n) {

        int[] arr = new int[n];
        arr[0] = 1;

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for(int i = 1; i < n; i++) {

            int a = arr[i2] * 2;
            int b = arr[i3] * 3;
            int c = arr[i5] * 5;

            arr[i] = Math.min(a, Math.min(b, c));

            if(arr[i] == a)
                i2++;

            if(arr[i] == b)
                i3++;

            if(arr[i] == c)
                i5++;
        }

        return arr[n - 1];
    }
}
