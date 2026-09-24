# Anagram Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, determine whether its characters can be rearranged to form a palindrome. Return  **true**  if it is possible to rearrange the string into a palindrome; otherwise, return  **false**.

 **Examples** 

```
Input: s = "baba"
Output: true
Explanation: Can be rearranged to form a palindrome "abba" 
```

```
Input: s = "geeksogeeks"
Output: true
Explanation: The characters of the string can be rearranged to form the palindrome "geeksoskeeg".

```

```
Input: s = "geeksforgeeks"
Output: false
Explanation: The given string can't be converted into a palindrome.

```

 **Constraints:** 
1 ≤ s.length ≤ 106
s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T10:35:22.964Z  

```java
class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(hs.contains(c))
                hs.remove(c);
            else 
                hs.add(c);
        }
        return hs.size()<=1?true:false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/anagram-palindrome4720/1)