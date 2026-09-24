class Solution {
    public int numberOfSubstrings(String s) {
        int[] last = {-1, -1, -1};
        int ans = 0;
        for (int j = 0; j < s.length(); j++) {
            last[s.charAt(j) - 'a'] = j;
            int x = Math.min(last[0], Math.min(last[1], last[2]));
            if (x != -1)
                ans += x + 1;
        }
        return ans;
    }
}
