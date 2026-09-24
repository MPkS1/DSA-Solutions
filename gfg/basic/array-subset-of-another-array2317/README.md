# Array Subset

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two arrays  **a[]** and  **b[]**, your task is to determine whether  **b[]**  is a subset of  **a[]**.

 **Examples:** 

```
Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: true
Explanation: b[] is a subset of a[]
```

```
Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
Output: true
Explanation: b[] is a subset of a[]
```

```
Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
Output: false
Explanation: b[] is not a subset of a[]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T07:21:27.465Z  

```java

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:b)
            hm.put(i,hm.getOrDefault(i,0)+1);
        for(int i:a)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)-1);
                if(hm.get(i)==0)
                    hm.remove(i);
            }
        }
        return hm.size()==0;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1)