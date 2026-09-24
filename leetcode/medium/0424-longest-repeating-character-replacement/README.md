# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 29 ms (beats 20.18%)  
**Memory:** 47.3 MB (beats 11.73%)  
**Submitted:** 2026-09-24T06:00:54.555Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)