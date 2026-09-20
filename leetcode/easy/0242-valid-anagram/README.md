# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 26 ms (beats 5.09%)  
**Memory:** 44.2 MB (beats 89.31%)  
**Submitted:** 2026-09-20T09:55:14.266Z  

```java
class Solution {
    public boolean isAnagram(String s,String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)-1);
        }
        for(int count:hm.values()) {
            if(count!=0)
                return false;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)