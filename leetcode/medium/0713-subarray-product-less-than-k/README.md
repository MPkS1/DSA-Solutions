# Subarray Product Less Than K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of integers `nums` and an integer `k`.

Return the number of contiguous subarrays where the  **product**  of all the elements in the  **subarray**  is  **strictly less**  than `k`.

 

 **Example 1:** 

```
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 0
Output: 0

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- 1 <= nums[i] <= 1000
- 0 <= k <= 106

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.97%)  
**Memory:** 48.7 MB (beats 89.95%)  
**Submitted:** 2026-09-24T04:42:26.598Z  

```java
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int i=0,pro=1,c=0;
        for(int j=0;j<nums.length;j++)
        {
            pro*=nums[j];
            while(pro>=k)
            {
                pro/=nums[i];
                i++;
            }
            c+=j-i+1;
        }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-product-less-than-k/)