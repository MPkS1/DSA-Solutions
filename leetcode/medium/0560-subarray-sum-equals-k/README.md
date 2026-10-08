# Subarray Sum Equals K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`, return  *the total number of subarrays whose sum equals to*  `k`.

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,1,1], k = 2
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 3
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -1000 <= nums[i] <= 1000
- -107 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 24 ms (beats 75.37%)  
**Memory:** 49.1 MB (beats 22.87%)  
**Submitted:** 2026-10-08T00:03:27.065Z  

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int cs=0,mc=0;
        hm.put(0,1);
        for(int i:nums)
        {   cs+=i;
            if(hm.containsKey(cs-k))
            {
                mc+=hm.get(cs-k);
            }
            hm.put(cs,hm.getOrDefault(cs,0)+1);
        }
        return mc;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)