# Closest to n and Divisible by m

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers  **n**  and  **m** (m != 0). The problem is to find the number closest to  **n**  and divisible by  **m**. If there is more than one such number, then output the one having the maximum absolute value.

 **Examples :** 

```
Input: n = 13, m = 4
Output: 12
Explanation: 12 is the Closest Number to 13 which is divisible by 4.
```

```
Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15 and divisible by 6, but -18 has the maximum absolute value. So, output is -18.
```

 **Constraints:** 
-105 ≤ n, m ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T12:59:07.668Z  

```java
class Solution {
    static int closestNumber(int n,int m) {
        m=Math.abs(m);
        int a=(n/m)*m;
        int b=n>=0?a+m:a-m;
        int x=Math.abs(n-a);
        int y=Math.abs(n-b);
        if(x<y)return a;
        if(y<x)return b;
        return Math.abs(a)>Math.abs(b)?a:b;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/closest-number5728/1)