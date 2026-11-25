
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k)
    {
        int l = num.length;
        List<Integer> arr = new ArrayList<>();
        for(int i = l-1; i >= 0; i--)
        {
            k = k + num[i];
            int d = k % 10;
            arr.add(d);
            k = k / 10;
        }
        while(k > 0)
        {
            int d = k % 10;
            arr.add(d);
            k = k / 10;
        }
        Collections.reverse(arr);
        return arr;
    }
}
