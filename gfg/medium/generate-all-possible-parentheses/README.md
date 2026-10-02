# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number  **n**, return all the combinations of balanced parentheses of length n.
 **Note:**  A sequence of parentheses is  **balanced**  if every opening bracket has a corresponding closing bracket in the  **correct order**.
For example, "(())", "()()", and "(()())" are balanced, whereas ")()(", "))((", and "()))" are not.

 **Examples:** 

```
Input: n = 6
Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
Explanation: These are the only possible valid balanced parentheses.
```

```
Input: n = 4
Output: ["(())", "()()"]
Explanation: These are the only possible valid balanced parentheses.
```

 **Constraints:** 
1 ≤ n ≤ 16
n % 2 == 0

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T00:23:34.765Z  

```java
class Solution {
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> l=new ArrayList<>();
        backtrack(l,"",0,0,n/2);
        return l;
    }
    public static void backtrack(List<String> l,String s,int o, int c
    ,int n)
    {
        if(s.length()==2*n)
        {
            l.add(s);
            return;
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

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1)