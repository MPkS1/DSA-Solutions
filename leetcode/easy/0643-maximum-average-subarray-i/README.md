# Maximum Average Subarray I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` consisting of `n` elements, and an integer `k`.

Find a contiguous subarray whose  **length is equal to**  `k` that has the maximum average value and return  *this value*. Any answer with a calculation error less than `10-5` will be accepted.

 

 **Example 1:** 

```
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

```

 **Example 2:** 

```
Input: nums = [5], k = 1
Output: 5.00000

```

 

 **Constraints:** 

- n == nums.length
- 1 <= k <= n <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 45 MB  
**Submitted:** 2026-09-20T06:51:45.300Z  

```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        int i=0,j=k-1,sum=0;
        for(int l=0;l<k;l++)
            sum+=nums[l];
        max=sum/k;
        System.out.println(max);
        while(j<nums.length-1)
        {
            sum-=nums[i++];
            sum+=nums[++j];
            if(sum/k>max)
            {
                 max=sum/k;
                System.out.println(max);
            }   
            
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)