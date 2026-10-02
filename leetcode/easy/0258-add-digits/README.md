# Add Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

 

 **Example 1:** 

```
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

```

 **Example 2:** 

```
Input: num = 0
Output: 0

```

 

 **Constraints:** 

- 0 <= num <= 231 - 1

 

 **Follow up:**  Could you do it without any loop/recursion in `O(1)` runtime?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 98.09%)  
**Memory:** 42.8 MB (beats 9.70%)  
**Submitted:** 2026-10-02T00:38:58.979Z  

```java
class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>9)
        {
            int n=num,sum1=0;
            while(n>0)
            {
                int n1=n%10;
                sum1+=n1;
                n=n/10;
            }
            num=sum1;

        }
        return num;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-digits/)