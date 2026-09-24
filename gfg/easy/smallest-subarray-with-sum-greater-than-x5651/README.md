# Smallest Subarray Sum Greater Than x

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **x** and an array of integers  **arr**, find the smallest subarray with sum strictly greater than the given value. If such a subarray do not exist return 0 in that case.

 **Examples:** 

```
Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
Output: 3
Explanation: Minimum length subarray is [4, 45, 6]
```

```
Input: x = 100, arr[] = [1, 10, 5, 2, 7]
Output: 0
Explanation: No subarray exist
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T12:37:36.958Z  

```java
class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int i=0,min=Integer.MAX_VALUE,j=0,sum=0;
        while(j<arr.length)
        {
            sum+=arr[j];
            while(sum>x)
            {
                min=Math.min(min,j-i+1);
                sum-=arr[i];
                i++;
            }
                j++;
        }
        return min!=Integer.MAX_VALUE?min:0;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1)