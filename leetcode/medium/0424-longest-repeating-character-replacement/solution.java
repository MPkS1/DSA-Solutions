class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0, mf = 0, m = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            mf = Math.max(mf, hm.get(c));
            while ((j - i + 1) - mf > k) {
                char x = s.charAt(i);
                hm.put(x, hm.get(x) - 1);
                i++;
            }
            m = Math.max(m, j - i + 1);
        }
        return m;
    }
}