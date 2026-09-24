# Binary Subarrays With Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums` and an integer `goal`, return  *the number of non-empty  **subarrays**  with a sum*  `goal`.

A  **subarray**  is a contiguous part of the array.

 

 **Example 1:** 

```
Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]

```

 **Example 2:** 

```
Input: nums = [0,0,0,0,0], goal = 0
Output: 15

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- nums[i] is either 0 or 1.
- 0 <= goal <= nums.length

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.4 MB  
**Submitted:** 2026-09-24T01:39:02.078Z  

```java
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0,count=0;
        for(int i:nums)
        {
            sum+=i;
            if(hm.containsKey(sum-goal))
            {
                count+=hm.get(sum-goal);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-subarrays-with-sum/)