# Count Number of Nice Subarrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`. A continuous subarray is called  **nice**  if there are `k` odd numbers on it.

Return  *the number of  **nice**  sub-arrays*.

 

 **Example 1:** 

```
Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

```

 **Example 2:** 

```
Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.

```

 **Example 3:** 

```
Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16

```

 

 **Constraints:** 

- 1 <= nums.length <= 50000
- 1 <= nums[i] <= 10^5
- 1 <= k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 95.80%)  
**Memory:** 59.4 MB (beats 59.12%)  
**Submitted:** 2026-09-24T01:50:21.399Z  

```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0,j=0,count=0,cc=0,even=0;
        while(j<nums.length)
        {
            if(nums[j]%2!=0)
            {
                cc++;
                even=0;
            }
            j++;
            while(cc==k)
            {
                even++;
                if(nums[i]%2!=0)
                {
                    cc--;
                }
                i++;
            }
            count+=even;
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-number-of-nice-subarrays/)