# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the longest*   *palindromic*   *substring*  in `s`.

 

 **Example 1:** 

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

```

 **Example 2:** 

```
Input: s = "cbbd"
Output: "bb"

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 92.82%)  
**Memory:** 43.6 MB (beats 70.46%)  
**Submitted:** 2026-10-02T00:58:54.740Z  

```java
class Solution {
    public String longestPalindrome(String ss) {
        int s=0,e=0;
        for(int i=0;i<ss.length();i++)
        {
            int len1=expand(ss,i,i);
            int len2=expand(ss,i,i+1);
            int len=Math.max(len1,len2);
            if(len>e-s)
            {
                s=i-(len-1)/2;
                e=i+len/2;
            }
        }
        return ss.substring(s,e+1);
    }
    public int expand(String s,int left,int right)
    {
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)