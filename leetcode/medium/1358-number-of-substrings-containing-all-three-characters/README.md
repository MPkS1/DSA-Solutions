# Number of Substrings Containing All Three Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` consisting only of characters  *a*,  *b*  and  *c*.

Return the number of substrings containing  **at least**  one occurrence of all these characters  *a*,  *b*  and  *c*.

 

 **Example 1:** 

```
Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 

```

 **Example 2:** 

```
Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 

```

 **Example 3:** 

```
Input: s = "abc"
Output: 1

```

 

 **Constraints:** 

- 3 <= s.length <= 5 x 104
- s only consists of 'a', 'b' or 'c' characters.

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 65.82%)  
**Memory:** 46.6 MB (beats 22.66%)  
**Submitted:** 2026-09-24T06:20:02.378Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/)