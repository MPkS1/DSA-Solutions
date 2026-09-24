# Count Subarrays Where Max Element Appears at Least K Times

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` and a  **positive**  integer `k`.

Return  *the number of subarrays where the  **maximum**  element of* `nums` *appears  **at least*** `k` *times in that subarray.* 

A  **subarray**  is a contiguous sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,3,2,3,3], k = 2
Output: 6
Explanation: The subarrays that contain the element 3 at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].

```

 **Example 2:** 

```
Input: nums = [1,4,2,1], k = 3
Output: 0
Explanation: No subarray contains the element 4 at least 3 times.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 106
- 1 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.1 MB  
**Submitted:** 2026-09-24T06:45:04.319Z  

```java
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        for(int i:nums)
            max=Math.max(max,i);
        int i=0,c=0;
        long res=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==max)
                c++;
            while(c>=k)
            {
                if(nums[i]==max)
                    c--;
                i++;
            }
            res+=i;
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/)