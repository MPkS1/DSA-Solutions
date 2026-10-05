# Count Elements With Maximum Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array `nums` consisting of  **positive**  integers.

Return  *the  **total frequencies**  of elements in*  `nums`  *such that those elements all have the  **maximum**  frequency*.

The  **frequency**  of an element is the number of occurrences of that element in the array.

 

 **Example 1:** 

```
Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 27.51%)  
**Memory:** 44.1 MB (beats 33.23%)  
**Submitted:** 2026-10-05T05:01:56.033Z  

```java
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        int max=0,res=0;
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
            hs.add(i);
            if(max<hm.get(i))
                max=hm.get(i);
        }
        for(int i:hs)
        {
            if(hm.get(i)==max)
            {
                res+=max;
            }
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-elements-with-maximum-frequency/)