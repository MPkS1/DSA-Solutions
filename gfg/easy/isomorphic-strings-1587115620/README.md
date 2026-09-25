# Isomorphic Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2**  consisting only of lowercase English letters and having the same length, check whether they are isomorphic. Two strings are isomorphic if:

- Each character in s1 must always map to the same character in s2.
- No two different characters in s1 can map to the same character in s2.
- A character may map to itself.

Return true if s1 and s2 are isomorphic, otherwise return false.

 **Examples:** 

```
Input: s1 = "aab", s2 = "xxy"
Output: true
Explanation: Each character in s1 can be consistently mapped to a unique character in s2 (a -> x, b -> y).

```

```
Input: s1 = "aab", s2 = "xyz"
Output: false
Explanation: Same character 'a' in s1 maps to two different characters 'x' and 'y' in s2.
```

```
Input: s1 = "abc", s2 = "xxz"
Output: false
Explanation: Two different characters 'a' and 'b' in s1 maps with same character 'x' in s2. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:31:27.200Z  

```java
class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char a=s1.charAt(i);
            char b=s2.charAt(i);

            if(map1.containsKey(a) && map1.get(a)!=b){
                return false;
            }

            if(map2.containsKey(b) && map2.get(b)!=a){
                return false;
            }

            map1.put(a,b);
            map2.put(b,a);
        }
        return true;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1)