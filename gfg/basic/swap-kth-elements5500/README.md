# Swap kth elements

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**, swap the  **kth**  element from the beginning with the  **kth**  element from the end.

Note: 1-based indexing is followed.

 **Examples :** 

```
Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3
Output: [1, 2, 6, 4, 5, 3, 7, 8]
Explanation: 3rd element from beginning is 3 and 3rd element from end is 6, so we replace 3 & 6.
```

```
Input: arr[] = [5, 3, 6, 1, 2], k = 2
Output: [5, 1, 6, 3, 2]
Explanation: 2nd element from beginning is 3 and from end is 1.

```

 **Constraints:** 
1 ≤ arr.size(), k ≤ 106
-109 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T09:15:57.731Z  

```java

class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        int i=k-1,j=arr.size()-k;
        int t=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,t);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/swap-kth-elements5500/1)