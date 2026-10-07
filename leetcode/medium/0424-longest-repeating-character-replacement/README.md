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
**Runtime:** 27 ms (beats 24.29%)  
**Memory:** 47 MB (beats 24.31%)  
**Submitted:** 2026-10-07T23:21:21.511Z  

```java
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0,m=0,mf=0;
        for(int j=0;j<s.length();j++)
        {
            char rc=s.charAt(j);
            hm.put(rc,hm.getOrDefault(rc,0)+1);
            mf=Math.max(mf,hm.get(rc));
            while((j-i+1)-mf>k)
            {
                char lc=s.charAt(i);
                hm.put(lc,hm.get(lc)-1);
                i++;
            }
            m=Math.max(m,j-i+1);
        }
        return m;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)