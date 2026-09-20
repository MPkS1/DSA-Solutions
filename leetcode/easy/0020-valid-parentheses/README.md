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
**Runtime:** 4 ms (beats 36.53%)  
**Memory:** 43.3 MB (beats 40.99%)  
**Submitted:** 2026-09-20T07:10:33.387Z  

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {   
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                st.push(c);
            else
            {
                if(st.size()==0)
                    return false;
                if(st.peek()=='('&&c==')')
                    st.pop();
                else if(st.peek()=='{'&&c=='}')
                    st.pop();
                else if(st.peek()=='['&&c==']')
                    st.pop();
                else
                    return false;
            }
        }
        return (st.size()==0)?true:false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)