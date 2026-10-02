# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given `n` pairs of parentheses, write a function to  *generate all combinations of well-formed parentheses*.

 

 **Example 1:** 

```
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

```

 **Example 2:** 

```
Input: n = 1
Output: ["()"]

```

 

 **Constraints:** 

- 1 <= n <= 8

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 68.84%)  
**Memory:** 44.6 MB (beats 54.52%)  
**Submitted:** 2026-10-02T00:11:28.682Z  

```java
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        backtrack(l,"",0,0,n);
        return l;
    }
    public static void backtrack(List<String> l,String s,int o,int c,int n)
    {
        if(s.length()==2*n)
        {
            l.add(s);
            return ;
        }
        if(o<n)
        {
            backtrack(l,s+"(",o+1,c,n);
        }
        if(c<o)
        {
            backtrack(l,s+")",o,c+1,n);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/generate-parentheses/)