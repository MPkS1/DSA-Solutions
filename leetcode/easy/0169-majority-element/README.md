# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-10-04T09:50:22.801Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int maj=0;
        if(nums.length==1)
            return nums[0];
        for(int i:nums)
        {
            if(hm.containsKey(i)&&hm.get(i)>=(nums.length/2))
            {
                maj=i;
                break;
            }
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        return maj;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)