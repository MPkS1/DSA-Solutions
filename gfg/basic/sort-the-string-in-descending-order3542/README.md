# Sort String in Descending Order

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s** containing only lowercase alphabets, the task is to sort it in lexicographically-descending order.

 **Note :**  A string is in lexicographically descending order if characters are arranged from larger to smaller based on dictionary order (i.e., 'z' comes before 'a').

 **Examples:** 

```
Input: s = "geeks"
Output: "skgee"
Explanation: It's the lexicographically descending order.

```

```
Input: s = "for"
Output: "rof"
Explanation: "rof" is in lexicographically-descending order.

```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T12:34:57.516Z  

```java
class Solution {
    public String reverseSort(String s) {
        // code here
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder str=new StringBuilder();
        for(int i=25;i>=0;i--){
            while(freq[i]>0){
                str.append((char)(i+'a'));
                freq[i]--;
            }
        }
        return str.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-the-string-in-descending-order3542/1)