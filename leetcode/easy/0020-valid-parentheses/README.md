# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 85.93%)  
**Memory:** 43.8 MB (beats 5.70%)  
**Submitted:** 2026-10-02T00:33:16.139Z  

```java
class Solution {
    public boolean isValid(String s1) {
        Stack<Character> s=new Stack<>();
        for(char c:s1.toCharArray())
        {
            if(c=='('||c=='['||c=='{')
                s.push(c);
            else
            {
                if(s.size()==0)
                    return false;
                else if(s.peek()=='('&&c==')')
                    s.pop();
                else if(s.peek()=='['&&c==']')
                    s.pop();
                else if(s.peek()=='{'&&c=='}')
                    s.pop();
                else
                    return false;
            }
        }
        return s.size()==0?true:false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)