# Longest Consecutive Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an unsorted array of integers `nums`, return  *the length of the longest consecutive elements sequence.* 

You must write an algorithm that runs in `O(n)` time.

 

 **Example 1:** 

```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

```

 **Example 2:** 

```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

```

 **Example 3:** 

```
Input: nums = [1,0,1,2]
Output: 3

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 7 ms  
**Memory:** 43.2 MB  
**Submitted:** 2026-10-04T07:32:43.386Z  

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2)
            return nums.length;
        Arrays.sort(nums);
        int i=0,j=1,max=Integer.MIN_VALUE,c=0;
        while(i<nums.length-1&&j<nums.length)
        {
            while(nums[i]==nums[j]&&j<nums.length-1)
            {
                j++;
            }
            if(nums[j]-nums[i]==1)
            {
                if(c==0)
                {
                    c++;
                }
                c++;
                System.out.println(i+" "+j+" "+c);
            }
            else
            {
                if(max<c)
                {
                    max=c;
                }
            }
            i=j;
            j++;
        }
        if(max<c)
        {
            max=c;
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)