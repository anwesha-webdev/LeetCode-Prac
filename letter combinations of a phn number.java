class Solution
{
    String keypad[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits)
    {
        if(digits.length() == 0)
            return ans;

        solve(digits, 0, "");

        return ans;
    }

    public void solve(String digits, int idx, String res)
    {
        if(idx == digits.length())
        {
            ans.add(res);
            return;
        }

        String letters = keypad[digits.charAt(idx) - '0'];

        for(int i = 0; i < letters.length(); i++)
        {
            char ch = letters.charAt(i);

            solve(digits, idx + 1, res + ch);
        }
    }
}
