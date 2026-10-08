# Contiguous Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums`, return  *the maximum length of a contiguous subarray with an equal number of* `0` *and* `1`.

 

 **Example 1:** 

```
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

```

 **Example 2:** 

```
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

```

 **Example 3:** 

```
Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-10-08T00:19:00.638Z  

```java
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int s=0,res=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            s+=(nums[i]==0)?-1:1;
            if(hm.containsKey(s))
            {
                res=Math.max(res,i-hm.get(s));
            }
            else
                hm.put(s,i);
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contiguous-array/)