# Sort Characters By Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, sort it in  **decreasing order**  based on the  **frequency**  of the characters. The  **frequency**  of a character is the number of times it appears in the string.

Return  *the sorted string*. If there are multiple answers, return  *any of them*.

 

 **Example 1:** 

```
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

```

 **Example 2:** 

```
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

```

 **Example 3:** 

```
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.

```

 

 **Constraints:** 

- 1 <= s.length <= 5 * 105
- s consists of uppercase and lowercase English letters and digits.

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 12.21%)  
**Memory:** 47.2 MB (beats 26.03%)  
**Submitted:** 2026-10-05T05:24:01.395Z  

```java
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;

        for(char c:s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);

            if(hm.get(c)>max)
                max=hm.get(c);
        }

        StringBuilder sb=new StringBuilder();

        while(max>0)
        {
            for(char c:hm.keySet())
            {
                if(hm.get(c)==max)
                {
                    for(int j=0;j<max;j++)
                    {
                        sb.append(c);
                    }
                }
            }

            max--;
        }

        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-characters-by-frequency/)