# Subarrays with K Different Integers

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an integer array `nums` and an integer `k`, return  *the number of  **good subarrays**  of* `nums`.

A  **good array**  is an array where the number of different integers in that array is exactly `k`.

- For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.

A  **subarray**  is a  **contiguous**  part of an array.

 

 **Example 1:** 

```
Input: nums = [1,2,1,2,3], k = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]

```

 **Example 2:** 

```
Input: nums = [1,2,1,3,4], k = 3
Output: 3
Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- 1 <= nums[i], k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 50 ms (beats 38.83%)  
**Memory:** 50.3 MB (beats 26.90%)  
**Submitted:** 2026-09-20T06:37:29.770Z  

```java
class Solution {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            map.put(nums[right],
                    map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {

                map.put(nums[left],
                        map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarrays-with-k-different-integers/)